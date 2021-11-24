package HandleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium_webdrivers\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in// ");
		String parent= driver.getWindowHandle();
		System.out.println("Parent Window"+parent);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Headphones", Keys.ENTER);

	}

}
