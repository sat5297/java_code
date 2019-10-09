to execute - first compile and then use the html file and use the applet viewer
// USE THIS - 
javac applet_prog.java
AppletViewer applet_prog.java

//OR 

appletviewer appletprog.html

applet is a dynamic, self-executing program
applets dont have a main function 
init() - first meathod to be run 
applets contents are dynamic 
minimize - stop function is called automatically and destroy meathod also

REPAINT() - 
	causes the awt runtime system to execute the update meathod of the component class 
	,which clears the window and update with the new content.
	
	paint() - draws the contents to the applet
	
