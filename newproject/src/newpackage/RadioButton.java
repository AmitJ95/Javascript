package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import java.util.List;
public class RadioButton {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\Amit\\Selenium\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	       /* driver.manage().window().maximize();
	        driver.navigate().to("http://demo.guru99.com/test/ajax.html");
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// TODO Auto-generated method stub
	        driver.findElement(By.id("no")).click();
	        driver.findElement(By.id("buttoncheck")).click();
	        driver.close();
	        System.exit(0);*/
	        
//find text of the radio buttons and print it on the output console	
	        driver.navigate().to("http://demo.guru99.com/test/ajax.html");
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	        List<WebElement> elements = driver.findElements(By.name("name"));
	        System.out.println("Number of elements:" +elements.size());
	        
	        for (int i=0; i<elements.size();i++){
	            System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
	        }

	}

}
