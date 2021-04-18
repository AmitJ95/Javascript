package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class LinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Amit\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://demo.guru99.com/test/link.html");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.linkText("click here")).click();	
		// TODO Auto-generated method stub

	}

}
