package SetupClass.TestStep;

import SetupClass.Set;
import cucumber.api.java.en.Given;

public class facebook_logout extends Set {
	

@Given("^navigate to the facebook url\\.$")
public void navigate_to_the_facebook_url() throws InterruptedException {
 
	driver.get("https://www.facebook.com");
	Thread.sleep(5000);
    driver.manage().deleteAllCookies();
    Thread.sleep(7000);
	
}


}
