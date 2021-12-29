package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DemoAutomation {
	
	//*** Chrome, Firefox, Edge ***//
	public static String browser = "Chrome"; // Set your browser in quotation "Browser Name"
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "E:\\\\SeleniumAutomationTest\\\\BrowserDriver\\\\chromedriver.exe");
		
		//Using Maven
		if (browser.equals("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
		}
		
		//click and show the free BongoBD youtube content
		driver.get("https://www.youtube.com/channel/UC9nuJbEL-AMJLLqc2-ej8xQ");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Search in youtube one of the contents in the BongoBD youtube channel
		driver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")).sendKeys("Zero Point |");
		
		//Click the search icon
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
		
		//load the content
		Thread.sleep(2000);
		
		//play the video
		driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div")).click();
		
	}

}
