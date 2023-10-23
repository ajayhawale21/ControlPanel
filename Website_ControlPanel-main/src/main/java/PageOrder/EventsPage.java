package PageOrder;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EventsPage {
	WebDriver driver;

	@FindBy(xpath = "//div[@class='logo']")
	WebElement logo;
	@FindBy(xpath = "/html/body/div/div/div[1]/div/ul/li[2]/span/div/div")
	WebElement EventsModule;
	@FindBy(xpath = "//*[text()='ADD EVENTS']")
	WebElement AddEventsBtn;
	@FindBy(xpath = "//*[@placeholder='enter title ']")
	WebElement EventTitle;
	@FindBy(xpath = "//textarea[@id='description']")
	WebElement EventDescription;
	@FindBy(xpath = "//span[text()='Upload']")
	WebElement EvThumbImageUploadBtn;
	@FindBy(xpath = "//span[text()='Add Images']")
	WebElement EvAddImgBtn;
	@FindBy(xpath = "//button[@type='submit']/span[text()='Add']")
	WebElement AddBtn;

	@FindBy(xpath = "(//div[@class='editBtn'])[3]")
	WebElement EditEvent;
	@FindBy(xpath = "(//div[@id='deleteImgModelBtn'])[1]")
	WebElement DeleteEditImg;
	@FindBy(xpath = "//textarea[@label='enter description']")
	WebElement DescriptionEdit; // event description
	@FindBy(xpath = "//button[@type='submit']/span[text()='Save Changes']")
	WebElement SaveChangesBtn;

	@FindBy(xpath = "(//div[@class='deleteBtn'])[5]")
	WebElement EventsDeleteBtn;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-default modelDeleteBtn']")
	WebElement DeleteFinalBtn;

	@FindBy(xpath = "//li[@class='ant-pagination-item ant-pagination-item-3']")
	WebElement ThirdPaginationBtn;
	@FindBy(xpath = "(//button[@class='ant-pagination-item-link'])[1]")
	WebElement BackPagination; // 2 times click

	public EventsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void logoDisplay() {

		boolean a = logo.isDisplayed();
		System.out.println(" The Brigosha logo is displaying - " + " " + a);

	}

	public void enterEventsMod() throws InterruptedException {
		Thread.sleep(5000);
		EventsModule.click();
		System.out.println("Enter in Events section");
		Thread.sleep(2000);
		AddEventsBtn.click();
	}

	public void AddEventName() throws InterruptedException {
		// random string of length 8 composed of alphabetic characters
		String title = RandomStringUtils.randomAlphabetic(5);
		System.out.println("The New Event Created  is .. " + title);
		driver.findElement(By.xpath("//*[@placeholder='enter title ']")).sendKeys("NewEvent" + title);
		Thread.sleep(2000);
		EventDescription.sendKeys("New Event Description....");
	}

	public void uploadFile() throws InterruptedException, AWTException {
		Actions act = new Actions(driver);
		WebElement uploadThumbImg = driver.findElement(By.xpath("//span[text()='Upload']"));
		act.moveToElement(uploadThumbImg).click().perform();
		Thread.sleep(2000);
	// driver.findElement(By.xpath("//span[text()='Upload']")).click();
	// uploadfile("C:\\Users\\Brigosha_Guest\\Desktop\\EventPic.jpg");
		 
		 Robot rb=new Robot();
		 rb.delay(2000);
		 StringSelection ss=new StringSelection("C:\\Users\\Brigosha_Guest\\Desktop\\EventPic.jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 
		// Contrl+V 
		 rb.keyPress(KeyEvent.VK_CONTROL);
		 rb.keyPress(KeyEvent.VK_V);
		 rb.delay(2000);
		 
		 rb.keyRelease(KeyEvent.VK_CONTROL);
		 rb.keyRelease(KeyEvent.VK_V);
		 rb.delay(5000);
		 //Enter
		 
		rb.keyPress(KeyEvent.VK_ENTER);
		 rb.delay(1000);
		rb.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
		//uploadfile("C:\\Users\\Brigosha_Guest\\Desktop\\EventPic.jpg");
		System.out.println("Event Thumbnail image is  gets uploaded..");
		Thread.sleep(8000);
		WebElement EventImages = driver.findElement(By.xpath("//span[text()='Add Images']"));
		act.moveToElement(EventImages).click().perform();
		Thread.sleep(2000);
		//uploadfile("C:\\Users\\Brigosha_Guest\\Desktop\\EventPic.jpg");

		rb.delay(2000);
		 StringSelection sb=new StringSelection("C:\\Users\\Brigosha_Guest\\Desktop\\EventPic.jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sb, null);
		 
		// Contrl+V 
		 rb.keyPress(KeyEvent.VK_CONTROL);
		 rb.keyPress(KeyEvent.VK_V);
		 rb.delay(2000);
		 
		 rb.keyRelease(KeyEvent.VK_CONTROL);
		 rb.keyRelease(KeyEvent.VK_V);
		 rb.delay(9000);
		 //Enter
		 
		rb.keyPress(KeyEvent.VK_ENTER);
		 rb.delay(9000);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		System.out.println("Event  image is  gets uploaded..");

		//Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(8000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-block addbtn']")));
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-block addbtn']")).click();
		//AddBtn.click();
		
		//WebElement SubmitBtn = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-block addbtn']"));
	//	JavascriptExecutor executor = (JavascriptExecutor)driver;
	//	executor.executeScript("arguments[0].click();", SubmitBtn);
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		System.out.println("Events gets successfully created.");

	}

	public void editEvent() throws InterruptedException {
		//EventsModule.click();
		Thread.sleep(2000);
		EditEvent.click();
		Thread.sleep(2000);
		DescriptionEdit.clear();
		Thread.sleep(2000);
		DescriptionEdit.sendKeys("Events Description Edited");
		Thread.sleep(2000);
		DeleteEditImg.click();
		Thread.sleep(2000);
		SaveChangesBtn.click();
		System.out.println(" Event has been edited ..");

	}

	public void deleteEvent() throws InterruptedException {
		Thread.sleep(3000);
		EventsDeleteBtn.click();
		Thread.sleep(2000);
		DeleteFinalBtn.click();
		System.out.println("Event Deleted ....");
	}

	public void pagination() throws InterruptedException {
		Thread.sleep(3000);
		ThirdPaginationBtn.click();
		Thread.sleep(2000);

		WebElement BackPaginationBtn = driver.findElement(By.xpath("(//button[@class='ant-pagination-item-link'])[1]"));

		for (int i = 0; i <= 2; i++) {
			BackPaginationBtn.click();
		}

		System.out.println("Pagination working fine in events page");

	}

	private void uploadfile(String string) {
		// TODO Auto-generated method stub

	}

}
