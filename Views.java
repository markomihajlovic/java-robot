import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.io.*;

public class Views {

static Robot robot;

public static void main(String[] args) throws Exception{

	/*
	// start Chrome
	robot.mouseMove(77,385);
	robot.mousePress(InputEvent.BUTTON1_MASK); 
	robot.mouseRelease(InputEvent.BUTTON1_MASK);
	
	*/
	while(true) {		
		video(380, 85);
		video(1111, 85);
		video(350, 628);
		video(1111, 630);
		Thread.sleep(66 * 1000);    // vid last ~ 1 min
	}
}

private static void video(int x, int y) throws Exception {
	robot = new Robot();
	robot.mouseMove(x,y); //you may want to move a few pixels closer to the center by adding to these values
	robot.mousePress(InputEvent.BUTTON1_MASK); //BUTTON1_MASK is the left button,
		                               //BUTTON2_MASK is the middle button, BUTTON3_MASK is the right button
	robot.mouseRelease(InputEvent.BUTTON1_MASK);

	String str = "youtube.com/watch?v=1rOqFB2H7I4";
   	/*
	robot.keyPress(KeyEvent.VK_Y);
   	robot.keyRelease(KeyEvent.VK_Y);
   	robot.keyPress(KeyEvent.VK_O);
   	robot.keyRelease(KeyEvent.VK_O);
   	robot.keyPress(KeyEvent.VK_U);
   	robot.keyRelease(KeyEvent.VK_U);
   	robot.keyPress(KeyEvent.VK_T);
   	robot.keyRelease(KeyEvent.VK_T);
   	robot.keyPress(KeyEvent.VK_U);
   	robot.keyRelease(KeyEvent.VK_U);
   	robot.keyPress(KeyEvent.VK_B);
   	robot.keyRelease(KeyEvent.VK_B);
   	robot.keyPress(KeyEvent.VK_E);
   	robot.keyRelease(KeyEvent.VK_E);
	*/

	Thread.sleep(200);    
StringSelection selection = new StringSelection(str);
Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
clipboard.setContents(selection, selection);

	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

	Thread.sleep(200);    
	robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(200);    

}
}
