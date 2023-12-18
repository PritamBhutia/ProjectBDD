package Com.Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Loginstepdef {
	public static WebDriver driver;

	@Given("^User Should be on login page$")
	public void user_Should_be_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "H:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.frontaccounting.eu/index.php");
	}

	@When("^User enters valid Credentials$")
	public void user_enters_valid_Credentials() throws Throwable {
		driver.findElement(By.name("user_name_entry_field")).clear();
		driver.findElement(By.name("user_name_entry_field")).sendKeys("demouser");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("SubmitUser")).click();
	}

	@Then("^User Should be on home Page$")
	public void user_Should_be_on_home_Page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Main Menu");

	}

	@Then("^User Should be on Dimensions page$")
	public void user_Should_be_on_Dimensions_page() throws Throwable {
		driver.findElement(
				By.xpath("//a[@class='menu_tab' and @href='./index.php?application=proj' and @accesskey='D']")).click();

		driver.findElement(By.xpath(
				"//a[@class='menu_option' and contains(@href, 'dimension_entry.php?') and contains(., 'Dimension Entry')]"))
				.click();

	}

	@Then("^User enters valid Name$")
	public void user_enters_valid_Name() throws Throwable {
		driver.findElement(By.xpath("//input[@type='text' and @name='name']")).sendKeys("Shibu");
		driver.findElement(By.xpath("//span[text()='Add']")).click();
	}

	@Then("^User Should be on Dimension Entry page$")
	public void user_Should_be_on_Dimension_Entry_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Dimension Entry");

	}

}
