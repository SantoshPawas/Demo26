package FileUpload_Download.FileUpload_Download_Demo;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class File_Download 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		
		HashMap mp=new HashMap();
		
		String s1=System.getProperty("user.dir")+"\\File_Download\\";
		
		mp.put("download.default_directory", s1);
		
		co.setExperimentalOption("prefs", mp);
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=114.0.5735.90/");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[text()='chromedriver_win32.zip']")).click();
		
		
		
		
		
	}

}
