//parameterized banner
import java.applet.*;
import java.awt.*;

import jdk.nashorn.internal.ir.CatchNode;

/*
<applet code="banner" width=300 height=100>
<param name=message value="java makes the web move">
</applet>
*/
public class banner extends Applet implements Runnable
{
    String msg;
    Thread t = null;
    volatile boolean stopFlag;
    //set colors and initialize thread 
    public void init()
    {
        setBackground(Color.BLUE);
        setForeground(Color.red);
    }
    //start thread
    public void start()
    {
        msg = getParameter("message");
        if(msg == null)
            msg = "message not found";
        msg = " " + msg;
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }
    public void run()
    {
        //re displaying banner
        for( ; ; )
        {
            try
	    {
                repaint();
                Thread.sleep(250);
                if(stopFlag)
                    break;
            }
            catch(InterruptedException e) {}
        }
    }
    public void stop()
    {
        stopFlag = true;
        t = null;
    }
    //display the banner now 
    public void paint(Graphics g)
    {
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1,msg.length());
        msg += ch;
        g.drawString(msg, 50, 30);
    }
}
