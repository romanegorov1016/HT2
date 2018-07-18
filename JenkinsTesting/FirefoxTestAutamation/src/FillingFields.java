import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FillingFields {
	
	public static void Filling(WebDriver driver, String path_to_field, String value) {
		
		WebElement field = driver.findElement(By.xpath(path_to_field));
		field.sendKeys(value);
	}

}
