import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation2Assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Varun Prakash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		driver.findElement(By.tagName("a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Selecting categories
		driver.findElement(By.xpath("//div[6]/ul[1]/li[3]/a[1]")).click();

		// Adding item to cart
		driver.findElement(By.className("ajax_add_to_cart_button")).click();

		// Proceed to checkout
		driver.findElement(By.xpath("//div[2]/div[4]/a[1]")).click();

		// Checking out
		driver.findElement(By.className("standard-checkout")).click();

		// Sign in Page -- Negative Testing by not logging in or registering for new
		// user

		// Directly clicking on Creating an account
		driver.findElement(By.id("SubmitCreate")).click();

		// Directly clicking on Sign in
		driver.findElement(By.id("SubmitLogin")).click();

	}
}
