package PageOrder;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeJoinUs {
	WebDriver driver;

	@FindBy(xpath = "(//li[@class='tab'])[3]")
	WebElement JoinUsModule;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-default sc-ikZpkk hesSvx primary']")
	WebElement ExploreJobsBtn;

	@FindBy(xpath = "(//div[@class='sc-bZnhIo eQNPgf'])[1]")
	WebElement FirstJobBox;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-default sc-cTQhss hqVZPj primary card-button']")
	WebElement ViewMoreBtn;

	@FindBy(xpath = "//div[@class='sc-bZnhIo eQNPgf']")
	WebElement JobsBoxCount;

	@FindBy(xpath = "(//div[@class='sc-eKszNL jxHPai'])[3]")
	WebElement ForwardPaginationBtn;

	@FindBy(xpath = "(//div[@class='sc-eKszNL jxHPai'])[1]")
	WebElement BackwardPaginationBtn;

	@FindBy(xpath = "//span[@class='ant-input-affix-wrapper sc-hTtwUo gqNdAe']")
	WebElement SearchField;

	@FindBy(xpath = "//div[@class='sc-bZnhIo eQNPgf']")
	WebElement FirstJobBoxMT;

	@FindBy(xpath = "//button[@type='button']/span[text()='Apply Now']")
	WebElement ApplyNowBtn;

	// filling job form  // test disable btn

	@FindBy(xpath = "//input[@id='basic_name']")
	WebElement NameField;

	@FindBy(xpath = "//input[@id='basic_email']")
	WebElement EmailField;

	@FindBy(xpath = "//input[@class='form-control ']")
	WebElement MobNumField;

	@FindBy(xpath = "//input[@id='basic_currentOrg']")
	WebElement CurrentOrgField;

	@FindBy(xpath="//div[@class='ant-upload-drag-container']")
	WebElement BrowseResumeField;
	
	@FindBy (xpath="//button[@type='submit']/span[text()='SUBMIT APPLICATION']")
	WebElement SubmitApplicationBtn;
	
	
	
	
	
	
	
	public WeJoinUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterInJoinUsMod() throws InterruptedException {
		JoinUsModule.click();
		System.out.println("Enter in Join Us Module");
		Thread.sleep(3000);
		boolean g = ExploreJobsBtn.isDisplayed();
		System.out.println("Explore jobs button is displaying. -" + g);
		ExploreJobsBtn.click();
	}

	public void JobCardsCount() {
		int size = driver.findElements(By.xpath("//div[@class='sc-bZnhIo eQNPgf']")).size();
		System.out.println("Total Jobs Present on first page-"+size);
	}

	public void applyingJob() throws InterruptedException {
		ViewMoreBtn.click();
		Thread.sleep(4000);
	}

	public void Pagination() throws InterruptedException {
		ForwardPaginationBtn.click();
		System.out.println("Join us-Forward pagination is working");
		Thread.sleep(3000);
		BackwardPaginationBtn.click();
		System.out.println("Join Us-Backward pagination is working");

	}

	public void applyingJobForm(String JobTitle, String CandName, String CandEmail, String CandPhone, String CurrentOrg) throws InterruptedException {
		SearchField.sendKeys(JobTitle);
		Thread.sleep(3000);
		NameField.sendKeys(CandName);
		Thread.sleep(2000);
		EmailField.sendKeys(CandEmail);
		Thread.sleep(3000);
		MobNumField.sendKeys(CandPhone);
		Thread.sleep(2000);
		CurrentOrgField.sendKeys(CurrentOrg);
	}
	
	public void UploadResume() throws InterruptedException, AWTException {

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
		 
		System.out.println("Resume not getting uploaded in image format..");
		Thread.sleep(8000);
		
		
		WebElement BrowseResume = driver.findElement(By.xpath("//div[@class='ant-upload-drag-container']"));
		Actions actn=new Actions(driver);
		actn.moveToElement(BrowseResume).click().perform();
		Thread.sleep(2000);
		

		rb.delay(2000);
		 StringSelection sb=new StringSelection("C:\\Users\\Brigosha_Guest\\Desktop\\ResumeBrigosha.pdf");
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
		
		
		
		System.out.println("Pdf format resume is  gets uploaded..");
		Thread.sleep(3000);
		SubmitApplicationBtn.click();
	}
	
	
	
	
	
	
	
	
	
}
