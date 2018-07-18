import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateUserTest {
	
	public static void checkFieldName(WebDriver driver, String path_to_fieldName, String path_to_field, String text) {
		WebElement fieldname = driver.findElement(By.xpath(path_to_fieldName));
		Assert.assertEquals (fieldname.getText(), text); //checking for field name correctness
		
		WebElement field=driver.findElement(By.xpath(path_to_field));
		Assert.assertEquals("",field.getText());  //checking for field emptiness
	}

}
