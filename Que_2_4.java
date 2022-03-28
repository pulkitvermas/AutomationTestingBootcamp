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

		// Account Login
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("varunprakash984@gmail.com");

		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Qwerty");

		driver.findElement(By.id("SubmitLogin")).click();

		// Selecting categories
		driver.findElement(By.xpath("//div[6]/ul[1]/li[3]/a[1]")).click();

		// Adding item to cart
		driver.findElement(By.className("ajax_add_to_cart_button")).click();

		// Proceed to checkout
		driver.findElement(By.xpath("//div[2]/div[4]/a[1]")).click();

		// Checking out
		driver.findElement(By.className("standard-checkout")).click();
		driver.findElement(By.xpath("(//button[@name='processAddress'])[1]")).click();

		// Shipping confirmation
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.className("standard-checkout")).click();

		// Payment Page
		driver.findElement(By.className("bankwire")).click();
		driver.findElement(By.xpath("(//button[@class='button btn btn-default button-medium'])[1]")).click();

//------------------------------Que4-------------------------//		

		driver.findElement(By.xpath("//a[@title='Back to orders']")).click();

		// Contacting customer care
		driver.findElement(By.xpath("//a[@title='Contact Us']")).click();

		// Filling form for contacting Customer Service
		Select subjectHeading = new Select(driver.findElement(By.id("id_contact")));
		subjectHeading.selectByVisibleText("Customer service");

		Select orderReference = new Select(driver.findElement(By.xpath("//select[@name='id_order']")));
		orderReference.selectByIndex(1);

		Select product = new Select(
				driver.findElement(By.cssSelector("div:nth-child(7) > div:nth-child(2) > select:nth-child(2)")));
		product.selectByIndex(1);

		WebElement message = driver.findElement(By.id("message"));
		message.sendKeys("Send Delivery Fast");

		driver.findElement(By.id("submitMessage")).click();

	}
}
