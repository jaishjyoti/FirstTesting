import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium_webdrivers\\chromedriver.exe");  

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/hotels");
		WebElement search=driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		WebElement cityName=driver.findElement(By.xpath("//*[@id=\"select2-hotels_city-container\"]"));
		WebElement checkout=driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
		WebElement checkin=driver.findElement(By.xpath("//*[@id=\"checkin\"]"));
		cityName.click();
		System.out.println(">>>>>>");
		cityName.sendKeys("Delhi");


	}

}
