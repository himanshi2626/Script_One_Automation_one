package SetupClass.TestStep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Sign_in_existing_free_user extends Set{
	WebDriverWait wait = new WebDriverWait(driver,30);
	
	@Given("^user is already on sign in page efu$")
	public void user_is_already_on_sign_in_page_efu() throws InterruptedException  {
		
		driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);
	    
		try {
			driver.findElement(By.cssSelector(".authorization-link > a:nth-child(1)")).click();
			Thread.sleep(2000);
			log.info("It's opening the website URL");
		} 
		catch (NoSuchElementException popup) {
		}
	    
	}

	@Then("^user enter email and password efu$")
	public void user_enter_email_and_password_efu() throws InterruptedException  {
		
		WebElement old_email = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
	    old_email.sendKeys("himanshi@test.com");
	    
	    WebElement old_pass = wait.until(ExpectedConditions.elementToBeClickable(By.id("pass")));
	    old_pass.sendKeys("123456");
	    
	   
	}

	@Then("^user click on login button efu$")
	public void user_click_on_login_button_efu() throws InterruptedException  {
	    
		 WebElement old_login_btn=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.login > span:nth-child(1)")));
		    old_login_btn.click();
	}

	@Then("^user go to free ppts page efu$")
	public void user_go_to_free_ppts_page_efu() throws InterruptedException  {
		WebElement free_ppt_btn=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li.menu-item:nth-child(2) > a:nth-child(1)")));
	    free_ppt_btn.click();
	}

	@Then("^user download a free ppt$")
	public void user_download_a_free_ppt() throws InterruptedException  {
	    
		driver.findElement(By.cssSelector("li.product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#clicking")).click();
		Thread.sleep(3000);
	}

}
