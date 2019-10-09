import java.applet.*;
import java.awt.*;
/*
<applet code="parameterpassing" width=300 height=50>
<param name=fontname  value=Courier>
<param name=fontsize  value=14>
<param name=leading  value=2 >
<param name=accountEnabled  value=true>
</applet>
*/
public class parameterpassing extends Applet
{
    String fontname;
    int fontsize;
    float leading;
    boolean active;
    //init the string to be displayed
    public void start()
    {
        String param;
        fontname = getParameter("fontname");
        if(fontname == null)
            fontname = "not found";
        param = getParameter("fontsize");
        try{
            if(param != null)
                fontsize = Integer.parseInt(param);
            else 
                fontsize = 0;
        }
        catch(NumberFormatException e){
            fontsize = -1;
        }
        param = getParameter("leading");
        try{
            if(param != null)
                leading = Float.valueOf(param).floatValue();
            else 
                leading = 0;
        }
        catch(NumberFormatException e)
        {
            leading = -1;
        }
        param = getParameter("accountEnabled");
        if(param != null)
            active = Boolean.valueOf(param).booleanValue();
    }
    //now display all the parameters we have here
    public void paint(Graphics g)
    {
        g.drawString("font name : " +fontname, 0, 10);
        g.drawString("font size : " +fontsize, 0, 26);
        g.drawString("leading : " +leading, 0, 42);
        g.drawString("account active : " +active, 0, 58);
    }
}
