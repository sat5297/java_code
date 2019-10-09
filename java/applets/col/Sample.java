import java.applet.*;
import java.awt.*;
/*
 <applet code="Sample" width=300 height=100>  </applet>
*/

public class Sample extends Applet
{
    String msg;
    //set foreground and background 
    public void init()
    {
        setBackground(Color.cyan);
        setBackground(Color.red);
        msg = "Inside init() --     ";
    }
    public void start()
    {
        msg += "inside start() --   ";
    }
    //now i need to display the msg in applet viewer
    public void paint(Graphics g)
    {
        msg += "inside paint() --   ";
        g.drawString(msg, 10, 30);
        showStatus("this is shown in status bar");
    }
}
