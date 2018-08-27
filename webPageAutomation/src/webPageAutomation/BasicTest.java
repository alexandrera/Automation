package webPageAutomation;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest {

//	@Before
//	public void startDriver() {
//		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//	}

	@Test
	public void myBasicTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(BasicPageObj.myWebsite);
		driver.manage().window().maximize();
		BasicPageObj.PlayVideo(driver).click();

		driver.close();
	}

}
