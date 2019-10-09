/*
a simple banner whihch uses multithreading for scrolling 
*/
import java.applet.*;
import java.awt.*;
/*
<applet code="banner" width=300 height=50>
</applet>
*/

public class banner extends Applet implements Runnable
{
    String msg = "a simple moving banner .. ";
    Thread t = null;
    int state;
    volatile boolean stopFlag;
    // volatile keyword here makes sure that the changes made in one thread are immediately reflect in other thread
    public void init()
    {
        setBackground(Color.white);
        setForeground(Color.GREEN);
    }
    public void start()
    {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }
    //entry point for the thread that runs the banner
    public void run()
    {
        //re display banner 
        for( ; ; )
        {
            try
            {
                repaint();
                Thread.sleep(250);
                if(stopFlag)
                    break;
            }
            catch(InterruptedException e){}
        }
    }
    public void stop()
    {
        stopFlag = true;
        t = null;
    }
    //display the banner 
    public void paint(Graphics g)
    {
        char ch;
        ch =  msg.charAt(0);
        msg = msg.substring(1,msg.length());
        msg += ch;
        g.drawString(msg,50,30);
    }
}
