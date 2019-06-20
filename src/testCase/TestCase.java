package testCase;

import org.testng.annotations.Test;
import base.Config;
import locators.Locator;
import values.Value;

public class TestCase extends Config {
	Locator loc = new Locator ();
	Value   val = new Value ();

	
	@Test
	public void signUp (){
		Application_Logs.info("....expedia sign up session started....");
		//System.out.println ("...................Expedia Sign Up session started................");
		//button
		clickById(loc.locatorId);
		clickByaccid(loc.accIdlocator);
		//type first name
		typeByfirstname(loc.firstnameLocator, val.firstnameValue);
		// type last name
		typeBylastname(loc.lastnameLocator, val.lastnameValue);
		//type email
		typeByemail(loc.emailLocator, val.emailValue);
		//type password
		typeBypassword(loc.passwordLocator,val.passwordValue);
		//button
		//clickByid(Signupl.expediaAccount);
		//clickByid(Signupl.expediacreateanAccount);
		//typeBybuttonId(loc.expediasignup);
		Application_Logs.info("sign up successfully");
		//System.out.println("sign up successfully...");
		
	}


}
