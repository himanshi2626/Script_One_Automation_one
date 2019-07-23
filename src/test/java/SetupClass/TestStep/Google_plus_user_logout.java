package SetupClass.TestStep;

import SetupClass.Set;
import cucumber.api.java.en.Given;

public class Google_plus_user_logout extends Set {


@Given("^open the google plus page\\.$")
public void open_the_google_plus_page() throws InterruptedException {
    Thread.sleep(3000);
	driver.get("https://mail.google.com");
	Thread.sleep(5000);
driver.manage().deleteAllCookies();
Thread.sleep(8000);
	
}
	
}
