package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class arrayv {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\devesh\\testing\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.getCurrentUrl();
	WebElement sh=driver.findElement(By.name("q"));
	sh.sendKeys("deveshmuka");
	Thread.sleep(12344);
	WebElement click=driver.findElement(By.className("btnK"));
	click.click();
	driver.close();
	
	}
	

	}


