package Pageobjects;

public class RegisterPage extends Page{
	// select salutation, Firstname,lastname, Email,Password,Date of birth
	String gender_field="#id_gender2";
	String firstname_field="input[id='customer_firstname']";
	String lastname_field="input[id='customer_lastname']";
	String email_field="input[id='email']";
	String password_field="input[id='passwd']";
	String days_field="days";
	String months_field="months";
	String years_field="years";
	String address_firstname_field="input[id='firstname']";
	String address_lastname_field="input[id='lastname']";
	String address_Address1_field="input[id='address1']";
	String address_city_field="input[id='city']";
	String address_state_field="id_state";
	String address_postalcode_field="input[id='postcode']";
	String address_country_field="id_country";
	String address_Mobilephone_field="input[id='phone_mobile']";
	String address_myaddress_field="input[id='alias']";
	String Register_field="button[id='submitAccount']";
	
 public void click_gender2(){
	 click(gender_field);
 }
 public void enter_Firstname( String inputvalue){
	 set_value(firstname_field,inputvalue);
 }
 public void enter_Lastname( String inputvalue){
	 set_value(lastname_field,inputvalue);
 }
 public void enter_Email( String inputvalue){
	 set_value(email_field,inputvalue);
 }
 public void enter_Password( String inputvalue){
	 set_value(password_field,inputvalue);
 }
 public void select_Date_DOB( String inputvalue){
	 select_value(days_field,inputvalue);
 }
 public void select_Month_DOB(String inputvalue){
	 select_value(months_field,inputvalue);
 }
 public void select_Year_DOB( String inputvalue){
	 select_value(years_field,inputvalue);
 }
 public void enter_address_firstname( String inputvalue){
	 set_value(address_firstname_field,inputvalue);
 }
 public void enter_address_lastname( String inputvalue){
	 set_value(address_lastname_field,inputvalue);
 }
 public void enter_address_Address1( String inputvalue){
	 set_value(address_Address1_field,inputvalue);
 }
 public void enter_city( String inputvalue){
	 set_value(address_city_field,inputvalue);
 }
 public void select_state( String inputvalue){
	 select_value(address_state_field,inputvalue);
 }
 public void enter_postalcode( String inputvalue){
	 set_value(address_postalcode_field, inputvalue);
 }
 public void select_country( String inputvalue){
	 select_value(address_country_field,inputvalue);
 }
 public void enter_Mobilephone( String inputvalue){
	 set_value(address_Mobilephone_field,inputvalue);
 }
 public void enter_Myaddress( String inputvalue){
	 set_value(address_myaddress_field,inputvalue);
 }
 public void click_on_Register(){
	 click(Register_field);
 }
}
