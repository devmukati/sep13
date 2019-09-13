package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\devesh\\testing\\driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("");
Dimension size=driver.findElement(By.id("iframe")).getSize();
System.out.println(size);
driver.switchTo().frame("If1");

driver.findElement(By.name("firstname")).sendKeys("vengat");
}
	}
