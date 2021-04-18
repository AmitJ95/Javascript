package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
public class MyClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","D:\\Amit\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        WebDriverWait myWaitVar = new WebDriverWait(driver, 10);
        //String baseUrl = "https://www.facebook.com/";
        //String tagName = "";
        
        driver.navigate().to("http://demo.guru99.com/test/newtours/");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        //tagName = driver.findElement(By.id("email")).getTagName();
        //driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("tutorials");
       // myElement.sendKeys("9953868154");  
      myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("Username")));
      driver.findElement(By.id("Username")).sendKeys("tutorials");
      
         driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("password");        
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
        
        
        //System.out.println(tagName);
        driver.close();
        System.exit(0);
        
        
        
        
        
        
	}

}
