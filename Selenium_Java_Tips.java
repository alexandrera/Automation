Automation Hacks

String campo_string = ProductsPageObj.ObservacoesLista(driver).getText();

if (campo_string == "Test") {
			System.out.println("Pass");

			}

			else {
				fail("Test Failed");
			}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

ExpectedConditions.textToBePresentInElementValue(ProductsPageObj.Somepage(driver), "Maecenas metus. Vivamus diam purus, cursus a, comm");

Assert.assertEquals("", ProductsPageObj.NomeLista(driver).getText());

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		ProductsPageObj.SearchStatus(driver).click();
		ProductsPageObj.SearchStatus(driver).sendKeys(Keys.ARROW_DOWN);
		ProductsPageObj.SearchStatus(driver).sendKeys(Keys.ENTER);

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

if (ProductsPageObj.SaveButton(driver).isEnabled() == false) {

			ProductsPageObj.Name(driver).isDisplayed();
			ProductsPageObj.Name(driver).sendKeys("Botão salvar está desabilitado" + i);

			ProductsPageObj.Departments(driver).click();
			ProductsPageObj.SelectItemDropdown(driver).click();
			ProductsPageObj.Departments(driver).click();
		}

		if (ProductsPageObj.SaveButton(driver).isEnabled() == true) {
			ProductsPageObj.SaveButton(driver).click();
		}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

int i = (int) ((new Date().getTime() / 1000) - 2000);

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

if (ProductsPageObj.SaveButton(driver).isDisplayed() == true
				&& ProductsPageObj.SaveButton(driver).isEnabled() == false) {

			ProductsPageObj.Name(driver).isDisplayed();
			ProductsPageObj.Name(driver).sendKeys("Botão salvar está desabilitado" + i);

			ProductsPageObj.Departments(driver).click();
			ProductsPageObj.SelectItemDropdown(driver).click();
			ProductsPageObj.Departments(driver).click();

		} else {

			fail("Failed");

		}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

TestNG Run test multiple times
@Test(invocationCount = 10)
public void testCount() {..}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Page Obj Element map

public static WebElement Email(WebDriver driver) {

	try {
	    Thread.sleep(500);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(By
		.xpath("/html//div[@id=1]")));

	return element;
    }
    
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
// mouse over
Actions action = new Actions(driver);
WebElement we = ContratosPageObj.ThisMainMenu(driver);
action.moveToElement(we).build().perform();

Actions action2 = new Actions(driver);
WebElement we2 = DashboardPageObj.BotaoStart(driver);
action2.moveToElement(we2).click().perform();

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public static final String baseURL1 = "http://serverAddress";
public static final String pathProperty = "C:/chromedriver.exe";
public static final String user = "user1";
public static final String password = "1234";

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


	String sArray[] = new String[] { "14955796000140", "75682023000122" };

	// convert array to list
	List<String> lList = Arrays.asList(sArray);

	while (ClientesPageObj.MensagemErroNomeExistente(driver).isDisplayed() != true) {

	    number++;

	    ClientesPageObj.Numero(driver).click();
	    ClientesPageObj.Numero(driver).sendKeys(lList.get(number));
	    ClientesPageObj.Salvar(driver).click();

	}

	ClientesPageObj.Voltar(driver).isDisplayed();
	
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Your check needs to happen before you get to the .isDisplayed() method. The way WebDriverWait().until(ExpectedConditions.visibilityOfElementLocated()) works, it will return 
either the element or throw an exception.

I would suggest something like this in your element find code:

public static WebElement Field(WebDriver driver) {

  try {
    Thread.sleep(500);
    WebElement element = (new WebDriverWait(driver, 9)).until(ExpectedConditions.visibilityOfElementLocated(By
    .xpath("element")));

    return element;
  } catch (Exception e) {
    return null;
  }

Then, in your search code:

if (PageObject.Field(driver) != null) {
  // logic for handling the field goes here
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Scroll Down and Up

JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,250)", "");
	
jse.executeScript("window.scrollBy(0,-250)", "");
OR,
jse.executeScript("scroll(0, -250);");

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Scrolling to Bottom of a page:

JavascriptExecutor js = ((JavascriptExecutor) driver);
js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Set browser property:

//Firefox

System.setProperty("webdriver.gecko.driver", "C:/Users/vntalar/Downloads/geckodriver.exe");
		
driver = new FirefoxDriver();
		
DesiredCapabilities capabilities = DesiredCapabilities.firefox();
capabilities.setCapability("marionette", true);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//Chrome

System.setProperty("webdriver.chrome.driver", "C:/Users/vntalar/Downloads/chromedriver.exe");
		
driver = new ChromeDriver();
		
DesiredCapabilities capabilities = DesiredCapabilities.chrome();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Different elements values, starts-with and contains
	
driver.findElement(By.xpath("//div[@aria-label='Corpo da mensagem']")).sendKeys(emailBody);
driver.findElement(By.xpath("//div[starts-with(@aria-label,'Enviar')]")).click();
driver.findElement(By.xpath("//div[contains(@aria-label,'Enviar')]")).click();

	----------------
		
ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));

---

@Test
public void testTabs() {
    driver.get("https://business.twitter.com/start-advertising");
    assertStartAdvertising();

    // considering that there is only one tab opened in that point.
    String oldTab = driver.getWindowHandle();
    driver.findElement(By.linkText("Twitter Advertising Blog")).click();
    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
    newTab.remove(oldTab);
    // change focus to new tab
    driver.switchTo().window(newTab.get(0));
    assertAdvertisingBlog();

    // Do what you want here, you are in the new tab

    driver.close();
    // change focus back to old tab
    driver.switchTo().window(oldTab);
    assertStartAdvertising();

    // Do what you want here, you are in the old tab
}

private void assertStartAdvertising() {
    assertEquals("Start Advertising | Twitter for Business", driver.getTitle());
}

private void assertAdvertisingBlog() {
    assertEquals("Twitter Advertising", driver.getTitle());
}

----

driver.close() and driver.quit() are two different methods for closing the browser session in Selenium WebDriver. Understanding both of them and knowing when to use which method is important in your test execution.

    driver.close() – It closes the the browser window on which the focus is set.

    driver.quit() – It basically calls driver.dispose method which in turn closes all the browser windows and ends the WebDriver session gracefully.

You should use driver.quit() whenever you want to end the program. It will close all opened browser window and terminates the WebDriver session. If you do not use driver.quit at the end of program, WebDriver session will not close properly and files would not be cleared off memory. This may result in memory leak errors.

In your case you have to use driver.close() which will close current window and keeps driver active.

Just to add - if there is only browser window open and you use driver.close(), it will quit the webdriver session. The webdriver will not stay active.

----

	@FindBy(how = How.XPATH, using = ".container tbody tr td:nth-of-type(3)")
	public static WebElement TotalAmount;

----
