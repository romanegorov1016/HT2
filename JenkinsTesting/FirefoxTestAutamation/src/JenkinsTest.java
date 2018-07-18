import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


class JenkinsTest {
		
	private static final String WEBDRIVER_GECKO_DRIVER = "webdriver.gecko.driver";
	private static final String GECKODRIVER_GECKODRIVER_EXE_PATH =  "D:\\JavaEnv\\geckodriver.exe";
	String login_string="admin";
	String password_string = "dca41073d50c442d8b3503abc5b07ec7";
	
	
	public static WebDriver driver;
	
	@BeforeAll
	public static void initialization() {
    System.setProperty(WEBDRIVER_GECKO_DRIVER, GECKODRIVER_GECKODRIVER_EXE_PATH);		
	driver= new FirefoxDriver();
	}
	
	@AfterAll
	public static void quit() {
		driver.quit();
	}	
	
	@Test
	void testConnection() {
		
		driver.get("http://localhost:8080/");
				
		WebElement login = driver.findElement(By.id(Paths.getJenkinsLogin()));
		login.sendKeys(login_string);
		
		WebElement password = driver.findElement(By.xpath(Paths.getJenkinsPassword()));
		password.sendKeys(password_string); 
		WebElement login_button = driver.findElement(By.id(Paths.getLoginButton()));
		login_button.click();
		
		WebElement manageJenkinsButton = driver.findElement(By.xpath(Paths.getManageJenkinsButton()));
			
		Assert.assertEquals(manageJenkinsButton.getText(), "Manage Jenkins");
			
	}
	
	@Test
	  void test1() {
		
		driver.get("http://localhost:8080/");
		
		WebElement manageJenkinsButton = driver.findElement(By.xpath(Paths.getManageJenkinsButton()));
		manageJenkinsButton.click();
		
		WebElement manageUserButton = driver.findElement(By.xpath(Paths.getManageUserButton()));
		Assert.assertEquals (manageUserButton.getText(), "Manage Users");
		
		WebElement manageUserButtonText = driver.findElement(By.xpath(Paths.getManageUserButtonText()));
		Assert.assertEquals (manageUserButtonText.getText(),"Create/delete/modify users that can log in to this Jenkins");
	}
	
	@Test
	  void test2() {
		
		driver.get("http://localhost:8080/manage");
		
		WebElement manageUserButton = driver.findElement(By.xpath(Paths.getManageUserButton()));
		manageUserButton.click();
		
		WebElement createUserButton = driver.findElement(By.xpath(Paths.getCreateUserButton()));
		Assert.assertEquals (createUserButton.getText(), "Create User");
	}
	
	@Test
	  void test3() {
		
		driver.get("http://localhost:8080/securityRealm/");
		
		WebElement createUserButton = driver.findElement(By.xpath(Paths.getCreateUserButton()));
		createUserButton.click();
		
		CreateUserTest.checkFieldName(driver, Paths.getUsername(),Paths.getUsernameField(),"Username:"); //Checking 1-st field
		CreateUserTest.checkFieldName(driver, Paths.getPassword(),Paths.getPasswordField(),"Password:"); // 2-nd
		CreateUserTest.checkFieldName(driver, Paths.getConfirmPassword(),Paths.getConfirmPasswordField(),"Confirm password:"); //...
		CreateUserTest.checkFieldName(driver, Paths.getFullName(),Paths.getFullNameField(),"Full name:");//...
		CreateUserTest.checkFieldName(driver, Paths.getEmailAddress(),Paths.getEmailAddressField(),"E-mail address:");//and, finaly, 5-th
	}
	
	@Test
	  void test4() {
		
		driver.get("http://localhost:8080/securityRealm/addUser");
		
		FillingFields.Filling(driver, Paths.getUsernameField(), "someuser"); 
		FillingFields.Filling(driver, Paths.getPasswordField(), "somepassword");
		FillingFields.Filling(driver, Paths.getConfirmPasswordField(), "somepassword");
		FillingFields.Filling(driver, Paths.getFullNameField(), "Some Full Name");
		FillingFields.Filling(driver, Paths.getEmailAddressField(), "some@addr.dom");
		
		WebElement createUser = driver.findElement(By.xpath(Paths.getCreateUser()));
		createUser.click();
		
		WebElement userName = driver.findElement(By.xpath(Paths.getUserId()));
		
		Assert.assertEquals (userName.getText(), "someuser");
	}	
	
	@Test
	  void test5() {
		
		driver.get("http://localhost:8080/securityRealm");
		
		WebElement deleteUser=driver.findElement(By.xpath(Paths.getDeleteUser()));
		deleteUser.click();
		
		WebElement deleteUserMessage=driver.findElement(By.xpath(Paths.getDeleteUserMessage()));
		Assert.assertEquals (deleteUserMessage.getText(), "Are you sure about deleting the user from Jenkins?");
	}
	
	@Test
	  void test6() {
		
		driver.get("http://localhost:8080/securityRealm");
		
		WebElement deleteUser=driver.findElement(By.xpath(Paths.getDeleteUser()));
		deleteUser.click();
		
		WebElement yesButton=driver.findElement(By.xpath(Paths.getYesButton()));
		yesButton.click();
		 	
		CheckPresent.check(driver, Paths.getUserId());
		CheckPresent.check(driver, Paths.getDeleteUser());
		
	}
	
	@Test
	  void test7() {
		
		driver.get("http://localhost:8080/securityRealm");
		
		CheckPresent.check(driver, "//a[@href='user/admin/delete']");		
	}
}
