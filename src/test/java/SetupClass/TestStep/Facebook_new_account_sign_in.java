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

public class Facebook_new_account_sign_in extends Set {
	
	WebDriverWait wait = new WebDriverWait(driver,50);


	@Given("^user is already on Home Page new fb$")
	public void user_is_already_on_Home_Page_new_fb() throws InterruptedException  {
		driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);
		
		try {
			WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
			if (logout.isEnabled()) {
				logout.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {

		}
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//a[contains(text(),'Sign in with Facebook')]")).click();
			Thread.sleep(2000);
			log.info("It's opening the website URL");
		} 
		catch (NoSuchElementException popup) {
		}
	    
	}

	@Then("^User click on sign in with facebook button$")
	public void user_click_on_sign_in_with_facebook_button() throws InterruptedException  {
		 WebElement fb_email = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		    fb_email.sendKeys("amw.vrushali@gmail.com");
		    
		    WebElement fb_pass = wait.until(ExpectedConditions.elementToBeClickable(By.id("pass")));
		    fb_pass.sendKeys("vrushali@786");
		    
		    WebElement fb_login_btn=wait.until(ExpectedConditions.elementToBeClickable(By.id("loginbutton")));
		    fb_login_btn.click();
	}

	@Then("^user go to free ppts page new fb$")
	public void user_go_to_free_ppts_page_new_fb() throws InterruptedException  {
		WebElement free_ppt_btn=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li.menu-item:nth-child(2) > a:nth-child(1)")));
	    free_ppt_btn.click();
	
	}
	    

	@Then("^user download a free ppt new fb$")
	public void user_download_a_free_ppt_new_fb() throws InterruptedException  {
		/*
		 * driver.findElement(By.
		 * cssSelector("li.product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)"
		 * )).click(); Thread.sleep(3000);
		 */
		
		driver.get("https://www.slideteam.net/prod-development-and-program-management.html");
		driver.findElement(By.cssSelector("#clicking")).click();
		Thread.sleep(3000);
	}

	@Then("^user delete the fb account new fb$")
	public void user_delete_the_fb_account_new_fb() throws InterruptedException  {
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		 WebElement my_account = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("ul.header > li:nth-child(1) > a:nth-child(1)")));
		 my_account.click();
		 Thread.sleep(3000);
		 WebElement delete_account = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#clicking")));
		 delete_account.click();
		 Thread.sleep(3000);
		 WebElement continue_delete = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn:nth-child(1)")));
		 continue_delete.click();
		 Thread.sleep(3000);
	}


	
}
