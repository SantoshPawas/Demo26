package FileUpload_Download.FileUpload_Download_Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Demo 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='uploader__btn tooltip--left active']")).click();
		
		StringSelection s1=new StringSelection("C:\\Users\\shree\\eclipse-workspace\\FileUpload_Download_Demo\\File_Upload\\Navoday Parth Pawase.pdf");
		
		//copy file into clipboard
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		//press control & v
		
		Robot r1=new Robot();
		
		//keypress
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		
		//keyrelease
		
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		
		
		Thread.sleep(2000);
		//press & relase enter
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_V);
		
		
		
		
		
	}

}
