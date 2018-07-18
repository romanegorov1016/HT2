
public class Paths {
	
    private static String jenkinsLogin="j_username";
    private static String jenkinsPassword="/html/body/div[4]/div[2]/div/form/table/tbody/tr[2]/td[2]/input";
    private static String loginButton="yui-gen1-button";
    private static String manageJenkinsButton="/html/body/div[4]/div[1]/div[1]/div[4]/a[2]";
    private static String manageUserButton="/html/body/div[4]/div[2]/div[16]/a/dl/dt";
    private static String manageUserButtonText="/html/body/div[4]/div[2]/div[16]/a/dl/dd[1]";
    private static String createUserButton="/html/body/div[4]/div[1]/div/div[3]/a[2]";
    
    private static String Username="/html/body/div[4]/div[2]/form/div[1]/table/tbody/tr[1]/td[1]";
    private static String UsernameField= "//*[@id=\"username\"]";
    private static String Password="/html/body/div[4]/div[2]/form/div[1]/table/tbody/tr[2]/td[1]";
    private static String PasswordField="/html/body/div[4]/div[2]/form/div[1]/table/tbody/tr[2]/td[2]/input";
    private static String ConfirmPassword="/html/body/div[4]/div[2]/form/div[1]/table/tbody/tr[3]/td[1]";
    private static String ConfirmPasswordField="/html/body/div[4]/div[2]/form/div[1]/table/tbody/tr[3]/td[2]/input";
    private static String FullName="/html/body/div[4]/div[2]/form/div[1]/table/tbody/tr[4]/td[1]";
    private static String FullNameField="/html/body/div[4]/div[2]/form/div[1]/table/tbody/tr[4]/td[2]/input";
    private static String EmailAddress="/html/body/div[4]/div[2]/form/div[1]/table/tbody/tr[5]/td[1]";
    private static String EmailAddressField="/html/body/div[4]/div[2]/form/div[1]/table/tbody/tr[5]/td[2]/input";
    private static String createUser="//*[@id=\"yui-gen1-button\"]";
    private static String deleteUser="//a[@href='user/someuser/delete']";
    private static String deleteUserMessage="/html/body/div[4]/div[2]/form";
    private static String yesButton="//*[@id=\"yui-gen1-button\"]";
    
    private static String UserId="/html/body/div[4]/div[2]/table/tbody/tr[3]/td[2]/a";
    
	public static String getJenkinsLogin() {
		return jenkinsLogin;
	}
	
	public static String getJenkinsPassword() {
		return jenkinsPassword;
	}
	
	public static String getLoginButton() {
		return loginButton;
	}
	
	public static String getManageJenkinsButton() {
		return manageJenkinsButton;
	}
	
	public static String getManageUserButton() {
		return manageUserButton;
	}
	
	public static String getManageUserButtonText() {
		return manageUserButtonText;
	}
	
	public static String getCreateUserButton() {
		return createUserButton;
	}

	public static String getUsername() {
		return Username;
	}

	public static String getUsernameField() {
		return UsernameField;
	}

	public static String getPassword() {
		return Password;
	}

	public static String getPasswordField() {
		return PasswordField;
	}

	public static String getConfirmPassword() {
		return ConfirmPassword;
	}

	public static String getConfirmPasswordField() {
		return ConfirmPasswordField;
	}

	public static String getFullName() {
		return FullName;
	}

	public static String getFullNameField() {
		return FullNameField;
	}

	public static String getEmailAddress() {
		return EmailAddress;
	}

	public static String getEmailAddressField() {
		return EmailAddressField;
	}

	public static String getCreateUser() {
		return createUser;
	}

	public static String getUserId() {
		return UserId;
	}

	public static String getDeleteUser() {
		return deleteUser;
	}

	public static String getDeleteUserMessage() {
		return deleteUserMessage;
	}

	public static String getYesButton() {
		return yesButton;
	}

}
