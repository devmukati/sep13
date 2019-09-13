package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\devesh\\testing\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com");

WebElement e=driver.findElement(By.id("email"));
	e.sendKeys("8827281301");
	WebElement p=driver.findElement(By.id("pass"));
	p.sendKeys("devesh");
WebElement	cl=driver.findElement(By.id("loginbutton"));
cl.click();
driver.navigate().to("https://accounts.google.com");
driver.navigate().forward();
WebElement gm=driver.findElement(By.id("identifierId"));
gm.sendKeys("devmukati70@gmail.com");
WebElement clk=driver.findElement(By.id("identifierNext"));
clk.click();
WebElement pass=driver.findElement(By.XPath("(//input[@id="identifierId"][1])"));
pass.sendKeys("8827281301");

	}

}
