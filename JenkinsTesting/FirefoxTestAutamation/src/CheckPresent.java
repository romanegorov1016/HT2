import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckPresent {
	public static void check(WebDriver driver, String path) {
		Boolean isPresent = driver.findElements(By.xpath(path)).size() > 0;
		Assert.assertFalse(isPresent);
   }
}
