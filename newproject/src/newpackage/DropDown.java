package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Amit\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
		// TODO Auto-generated method stub
		driver.close();
		System.exit(0);*/
        driver.navigate().to("http://jsbin.com/osebed/2");
        Select fruits = new Select(driver.findElement(By.id("fruits")));
        fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		driver.close();
		System.exit(0);
	}

}
