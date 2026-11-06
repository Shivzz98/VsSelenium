import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
	
	
	/*Web driver Locators:
	 * id
	 * xpath
	 * css selector
	 * name
	 * classname
	 * tagname
	 * link text
	 * partial link text
	 * 
	 */

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sivasankar Ayyasamy/eclipse-workspace/chromedriver-win64/chromedriver.exe"); //invoke chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("RahulShetty");
		driver.findElement(By.name("inputPassword")).sendKeys("Rahul123");
		driver.findElement(By.className("signInBtn")).click();
		
	}

}
