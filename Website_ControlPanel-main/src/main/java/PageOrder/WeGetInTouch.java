package PageOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeGetInTouch {
	WebDriver driver;

	@FindBy(xpath = "(//a[@href='/get-in-touch'])[1]")
	WebElement GetInTouchMod;

	@FindBy(xpath = "//div[@class='ant-row ant-row-center']")
	WebElement LocHeader;

	@FindBy(xpath = "//div[@class='sc-fnykZs ekakDV heading']")
	WebElement LocCardsHeading; // print all office heading

	@FindBy(xpath = "//input[@id='basic_name']")
	WebElement NameField; // scroll upto

	@FindBy(xpath = "//input[@id='basic_email']")
	WebElement MailField;

	@FindBy(xpath = "//input[@class='form-control ']")
	WebElement PhoneNumField;

	@FindBy(xpath = "//textarea[@id='basic_message']")
	WebElement MsgField;

	@FindBy(xpath = "//button[@type='submit']/span[text()='SUBMIT']")
	WebElement SubmitBtn;

	public WeGetInTouch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void FillingFomGIT(String NameV, String EmailV, String PhoneV, String Messagev) throws InterruptedException {
		GetInTouchMod.click();
		Thread.sleep(3000);
		String Title = LocHeader.getText();
		System.out.println("FirstLine Header-" + Title);

		int size = driver.findElements(By.xpath("//div[@class='sc-fnykZs ekakDV heading']")).size();
		System.out.println("Total Locations are present are=" + size);
		for (int i = 0; i < size; i++) {
			String name = driver.findElements(By.xpath("//div[@class='sc-fnykZs ekakDV heading']")).get(i).getText();
			System.out.println("The Offices are :" + name);

			Actions act = new Actions(driver);
			WebElement NameField = driver.findElement(By.xpath("//input[@id='basic_name']"));
			act.moveToElement(NameField).perform();

			NameField.sendKeys(NameV);
			Thread.sleep(2000);
			MailField.sendKeys(EmailV);
			Thread.sleep(2000);
			PhoneNumField.sendKeys(PhoneV);
			Thread.sleep(2000);
			MsgField.sendKeys(Messagev);
			Thread.sleep(2000);
			SubmitBtn.click();
			System.out.println("Visitor Get In Touch Form fill get successfully.");

		}

	}
}
