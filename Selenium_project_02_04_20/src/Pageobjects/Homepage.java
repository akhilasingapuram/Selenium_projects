package Pageobjects;

public class Homepage extends Page {
	// click on sign in and enter email address and click on create an account
	//locators
	String sign_in_field="a[class='login']";
	String email_field="input[id='email_create']";
	String create_account_field="button[id='SubmitCreate']";
	
	//reusable methods
	public void launch(String url){
		launchapp(url);
	}
	
	public void click_signin() {
		click(sign_in_field);
	}

	public void enter_email(String inputvalue) {
		set_value(email_field, inputvalue);
	}

	public void click_create_an_account() {
		click(create_account_field);
	}
}
