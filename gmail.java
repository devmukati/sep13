package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\devesh\\testing\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");

WebElement e=driver.findElement(By.id("identifierId"));
e.sendKeys("devmukati70@gmail.com");
WebElement btn=driver.findElement(By.className("CwaK9"));
btn.click();
Thread.sleep(10000);
WebElement pa=driver.findElement(By.name("password"));
pa.sendKeys("8827281301");
WebElement bt=driver.findElement(By.className("CwaK9"));
bt.click();
driver.close();
	}

}
