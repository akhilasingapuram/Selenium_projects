package tests;

import java.io.IOException;
import java.util.Random;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.Homepage;
import Pageobjects.RegisterPage;

public class NewTest1 {
	 Homepage hp = new Homepage();
	  RegisterPage rp= new RegisterPage();
	  
	  @BeforeTest
	  public void beforetest(){
		  hp.launch("http://automationpractice.com/index.php");
	  }
	  
	  @Test
	  public void registeruser() throws IOException{
		  hp.click_signin();
		  hp.waitForPageLoad();
		  hp.enter_email(rp.generateUsername());
		  hp.click_create_an_account();
		  hp.waitForPageLoad();
		  rp.click_gender2();
		  rp.enter_Firstname(rp.getProperty("src/resources/test1_data.properties", "firstname"));
		  rp.enter_Lastname(rp.getProperty("src/resources/test1_data.properties", "lastname"));
//		  rp.enter_Email("test13@gm.com");
		  rp.enter_Password(rp.getProperty("src/resources/test1_data.properties", "password"));
		  rp.select_Date_DOB(rp.getProperty("src/resources/test1_data.properties", "date_dob"));
		  rp.select_Month_DOB(rp.getProperty("src/resources/test1_data.properties", "month_dob"));
		  rp.select_Year_DOB(rp.getProperty("src/resources/test1_data.properties", "years_dob"));
		  rp.enter_address_firstname(rp.getProperty("src/resources/test1_data.properties", "address_firstname"));
		  rp.enter_address_lastname(rp.getProperty("src/resources/test1_data.properties", "address_lastname"));
		  rp.enter_address_Address1(rp.getProperty("src/resources/test1_data.properties", "address_address1"));
		  rp.enter_city(rp.getProperty("src/resources/test1_data.properties", "city"));
		  rp.select_state(rp.getProperty("src/resources/test1_data.properties", "state"));
		  rp.enter_postalcode(rp.getProperty("src/resources/test1_data.properties", "postalcode"));
		  rp.select_country(rp.getProperty("src/resources/test1_data.properties", "country"));
		  rp.enter_Mobilephone(rp.getProperty("src/resources/test1_data.properties", "Mobilephone"));
		  rp.enter_Myaddress(rp.getProperty("src/resources/test1_data.properties", "myaddress"));
		  rp.click_on_Register();
		  
		  
	  }
	  
	  
}
