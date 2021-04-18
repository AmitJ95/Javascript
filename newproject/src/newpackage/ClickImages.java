package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import java.util.List;


public class ClickImages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Amit\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/login/identify?ctx=recover");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //verify that we are now back on Facebook's homepage
        if (driver.getTitle().equals("Facebook-log in or sign up")) {							
            System.out.println("We are back at Facebook's homepage");					
        }
        else {			
            System.out.println("We are NOT in Facebook's homepage");					
        }		
         driver.close();
         System.exit(0);
     
		// TODO Auto-generated method stub

	}

}
