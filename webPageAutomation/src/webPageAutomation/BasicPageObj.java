package webPageAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicPageObj {

	public static final String myWebsite = "https://alexandrera.github.io/running.github.io/";

	public static WebElement PlayVideo(WebDriver driver) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html//div[@class='listAndVideo']//a[@href='https://en.wikipedia.org/wiki/Running']")));

		return element;
	}

}
