package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
//		FirefoxDriver driver1=new FirefoxDriver();
//		EdgeDriver driver2=new EdgeDriver();
		driver.get("https://www.google.com");
//		driver1.get("https://www.google.com");
//		driver2.get("https://www.google.com");
		String title=driver.getTitle();
		
		System.out.println("Actual title"+title);
		
		if(title.equals("Google"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.quit();
	}
	
}
