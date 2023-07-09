package selenium.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) throws AWTException, InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.findElement(By.linkText("Courses")).click();
		
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		System.out.println("a");
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		System.out.println("b");
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		System.out.println("c");
		robot.mouseMove(30, 100);
		System.out.println("d");
		driver.quit();
	}

}
