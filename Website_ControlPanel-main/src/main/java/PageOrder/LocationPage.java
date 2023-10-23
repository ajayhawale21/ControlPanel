package PageOrder;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationPage {
	WebDriver driver;

	@FindBy(xpath = "(//span[@class='ant-menu-title-content'])[5]")
	WebElement LocationMod;
	@FindBy(xpath = "//button[@type='button']/span[text()='ADD LOCATION']")
	WebElement addLocationBtn;

	@FindBy(xpath = "//input[@id='officeName']")
	WebElement OfficeTypeField;
	@FindBy(xpath = "//input[@id='locationName']")
	WebElement LocationField;
	@FindBy(xpath = "//textarea[@placeholder='Details about the location ']")
	WebElement AddressField;
	@FindBy(xpath = "//input[@placeholder='Enter 10 digit phone number']")
	WebElement PhoneNumberField;// input[@id='officeName']
	@FindBy(xpath = "//button[@type='submit']")
	WebElement AddBtn;

	@FindBy(xpath = "(//div[@class='editBtn'])[1]")
	WebElement EditBtn;// details clear sendkeys
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement SaveChangesBtn;

	@FindBy(xpath = "(//div[@class='deleteBtn'])[1]")
	WebElement deleteBtn;
	@FindBy(xpath = "//button[@type='button']/span[text()='Delete']")
	WebElement finalDelete;

	@FindBy(xpath = "(//button[@class='ant-pagination-item-link'])[2]")
	WebElement FrwdPagination;
	@FindBy(xpath = "(//button[@class='ant-pagination-item-link'])[1]")
	WebElement BackPagination;
	
	
	
		
	public LocationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void LocationMod() throws InterruptedException {
		Thread.sleep(4000);
		LocationMod.click();
		Thread.sleep(4000);
		System.out.println(" We Enter in Location Page.");
		addLocationBtn.click();
	}

	public void AddOfficeType() {
		// random string of length 8 composed of alphabetic characters
		String officeType = RandomStringUtils.randomAlphabetic(8);
		System.out.println("The UserName is .. " + officeType);
		driver.findElement(By.xpath("//input[@id='officeName']")).sendKeys("Corporate" + officeType);
	}

	public void AddLocation() throws InterruptedException {
		Thread.sleep(2000);
		// random string of length 8 composed of alphabetic characters
		String officeType = RandomStringUtils.randomAlphabetic(6);
		System.out.println("The location is .. " + officeType);
		driver.findElement(By.xpath("//input[@id='locationName']")).sendKeys("Corporate" + officeType);
	}

	public void addingAddress(String address) throws InterruptedException {
		Thread.sleep(2000);
		AddressField.sendKeys(address);
	}

	public void AddOfficePhone() throws InterruptedException {
		Thread.sleep(2000);
		Random r = new Random();

		int i1 = r.nextInt(8); // returns random number between 0 and 7
		int i2 = r.nextInt(8);
		int i3 = r.nextInt(8);
		int i4 = r.nextInt(742); // returns random number between 0 and 741
		int i5 = r.nextInt(10000); // returns random number between 0 and 9999

		String phoneNumber = String.format("%d%d%d%03d%04d", i1, i2, i3, i4, i5);

		driver.findElement(By.xpath("//input[@placeholder='Enter 10 digit phone number']")).sendKeys(phoneNumber);
		Thread.sleep(3000);
		AddBtn.click();

	}

	public void editLocation(String Description) throws InterruptedException {
		Thread.sleep(4000);
		EditBtn.click();
		Thread.sleep(5000);
		//AddressField.clear();
		driver.findElement(By.xpath("(//textarea[@id='detail'])[2]")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//textarea[@id='detail'])[2]")).sendKeys(Description);
		Thread.sleep(4000);
		SaveChangesBtn.click();
		System.out.println("Location has been edited...");
	}

	public void deleteLoc() throws InterruptedException {
		deleteBtn.click();
		Thread.sleep(2000);
		finalDelete.click();
	}

	public void Nextpagination() throws InterruptedException {

		WebElement NextPaginationBtn = driver.findElement(By.xpath("(//button[@class='ant-pagination-item-link'])[2]"));

		for (int i = 0; i <= 3; i++) {
			NextPaginationBtn.click();
			Thread.sleep(1000);
		}

		System.out.println("Forward Pagination working fine in location page");

	}

	public void Backpagination() throws InterruptedException {

		WebElement BackwardsPaginationBtn = driver
				.findElement(By.xpath("(//button[@class='ant-pagination-item-link'])[1]"));

		for (int i = 0; i <= 3; i++) {
			BackwardsPaginationBtn.click();
			Thread.sleep(1000);
		}

	}

}
