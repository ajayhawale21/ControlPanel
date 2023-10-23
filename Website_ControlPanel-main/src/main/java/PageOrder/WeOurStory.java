package PageOrder;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeOurStory {
	WebDriver driver;

	@FindBy(xpath = "//img[@class='header-company-icon']")
	WebElement Logo;
	@FindBy(xpath = "//a[@class='navTabs secondary active']")
	WebElement WeModule;

	@FindBy(xpath = "(//a[@href='/get-in-touch'])[4]")
	WebElement GetInTouchBtnSlide;

// our Expertise -- Automotive & IoT

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary card-button']")
	WebElement AutomotiveLearnMoreBtn;
	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-outline card-button'])[1]")
	WebElement IOTLearnMoreBtn;

	@FindBy(xpath = "(//div[@class='expertise-header heading'])[2]")
	WebElement OurCultureHeading; // just before view all events

	@FindBy(xpath = "//div[@class='event-head']")
	WebElement EventsCards; // 3 cards . elemnets
	@FindBy(xpath = "//h1[@class='title heading']")
	WebElement EventsTitles;

	@FindBy(xpath = "(//button[@class='glass-button'])[1]") // 1 no. event btn
	WebElement ExploreBtn;
	@FindBy(xpath = "//a[@href='/teams/eventGallery/eventId=18']/b[text()='Go to Gallery Page ']")
	WebElement GoToGalleryLink; // driver.navigate.back & our story scroll upto our culture

	@FindBy(xpath = "//u[text()='View All Events']")
	WebElement ViewAllEventsLink;
	@FindBy(xpath = "//div[@class='event-head']")
	WebElement EventsCardsCount;

	@FindBy(xpath = "//button[@class='glass-button']")
	WebElement ExploreBtnCount;
	@FindBy(xpath = "(//button[@class='glass-button'])[3]")
	WebElement ThirdEventsExplBtn; // go to gallery page >>
	@FindBy(xpath = "//div[@class='fullscreen-image']")
	WebElement ImagesCount; // it will show double count >> 2 times back

	@FindBy(xpath = "//div[@class='magazine-header heading']")
	WebElement EMagazineHeading;

	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-outline card-button'])[2]")
	WebElement DownloadMagBtn; // download magazine now btn
	@FindBy(xpath = "//div[@class='magazinecard']")
	WebElement EmagazineCount; // after cliking download now all magazine open for view & download

// move to 2nd magazine=hover on it. For displaying download btn  (//div[@class='magazinecard'])[2]=== 2nd magazine
	@FindBy(xpath = "(//span[@class='anticon anticon-download'])[2]")
	WebElement DownloadBtn;
	@FindBy(xpath = "(//span[@class='anticon anticon-close ant-modal-close-icon'])[2]")
	WebElement CloseBtn;

// meet the team Btn --is clickable

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-default team-button primary']")
	WebElement TeamBtn;

	@FindBy(xpath = "ant-btn ant-btn-default card-button primary")
	WebElement JoinUsBtn; // is clickable

// How can we help you
	@FindBy(xpath = "//input[@id='basic_name']")
	WebElement NameField;
	@FindBy(xpath = "//input[@id='basic_email']")
	WebElement EmailField;
	@FindBy(xpath = "//input[@class='form-control ']")
	WebElement MobileField;
	@FindBy(xpath = "//textarea[@id='basic_message']")
	WebElement MessageFIELD;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement SubmitBtn;

	public WeOurStory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Logodisplay() {
		boolean a = Logo.isDisplayed();
		System.out.println("Brigosha Logo is Displayed-" + " " + a);

	}

	public void WeModuleDisplay() {
		boolean b = WeModule.isDisplayed();
		System.out.println("We Enter in We Module-" + " " + b);
	}

	public void GetInTouchBtnClick() throws InterruptedException {
		boolean c = GetInTouchBtnSlide.isEnabled();
		System.out.println(" Get In Touch Buttons are clickable :" + c);
		GetInTouchBtnSlide.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}

	public void AutomLearnMoreBtns() {
		Actions act = new Actions(driver);
		WebElement AutomotiveLearnMoreBtn = driver
				.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary card-button']"));
		act.moveToElement(AutomotiveLearnMoreBtn).click().build().perform();

		String expectedTitle = "Explore The True ";
		String actuallyMsg = driver.findElement(By.xpath("//div[@class='potentialMobility-header heading']")).getText();
		System.out.println("After clicking on Automotive Learn More Button , We get meassage---" + actuallyMsg);
		if (expectedTitle.contains(actuallyMsg)) {

			System.out.println("It is Header success....");
		} else if (!expectedTitle.contains(actuallyMsg)) {

			System.out.println("It is fail.... to capture Header success");

		}
		driver.navigate().back();
	}

	public void IOTLearnMoreBtn() {

		Actions action = new Actions(driver);
		WebElement IotLearnMoreBtn = driver
				.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary card-button']"));
		action.moveToElement(IotLearnMoreBtn).click().build().perform();

		String expectedTitle = "Explore The True ";
		String actuallyMsg = driver.findElement(By.xpath("//div[@class='potentialMobility-header heading']")).getText();
		System.out.println("After clicking on Automotive Learn More Button , We get meassage---" + actuallyMsg);
		if (expectedTitle.contains(actuallyMsg)) {

			System.out.println("It is Header success....");
		} else if (!expectedTitle.contains(actuallyMsg)) {

			System.out.println("It is fail.... to capture Header success");

		}
		driver.navigate().back();
	}

	public void EventsCards() {
		// EventsCardsCount.getSize();
		int size = driver.findElements(By.xpath("//div[@class='event-head']")).size();
		System.out.println("The total events displaying on our story page :" + " " + size);

	}

	public void EnterInEvent() throws InterruptedException {
		ExploreBtn.click();
		Thread.sleep(2000);
		GoToGalleryLink.click();
		Thread.sleep(2000);
		int count = driver.findElements(By.xpath("//div[@class='fullscreen-image']")).size();
		System.out.println("Images present in particular event :" + " " + count);
		driver.navigate().back();
	}

	public void AllEvents() throws InterruptedException {
		ViewAllEventsLink.click();
		Thread.sleep(2000);
		int TotalEventCount = driver.findElements(By.xpath("//div[@class='ant-col team-card']")).size();
		System.out.println("Total events Present -" + TotalEventCount);
		ThirdEventsExplBtn.click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	public void ViewingEMagazine() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement IotLearnMoreBtn = driver.findElement(By.xpath("//div[@class='magazine-header heading']"));
		action.moveToElement(IotLearnMoreBtn).build().perform();
		Thread.sleep(2000);
		DownloadMagBtn.click();
		Thread.sleep(2000);
		int MagazineCount = driver.findElements(By.xpath("//div[@class='magazinecard']")).size();
		System.out.println("Total E-Magazines are - " + MagazineCount);
	}

	public void OpenEMagazine() throws InterruptedException {
		Actions ac = new Actions(driver);
		WebElement EMagazine = driver.findElement(By.xpath("(//div[@class='magazinecard'])[2]"));
		ac.moveToElement(EMagazine).build().perform();
		Thread.sleep(2000);
		DownloadBtn.click();
		System.out.println("E-Magazine  downloaded");
		// driver.findElement(By.xpath("(//span[@class='anticon
		// anticon-eye'])[2]")).click();

		// System.out.println("E magazine open...");
		// After viewing new tab opens. We need to get back to previous tab
		// CloseBtn.click();
	}

	public void MeetTeam() throws InterruptedException {// div[@class='card-heading heading']
		boolean d = TeamBtn.isEnabled();
		System.out.println("Meet The Team Button is Clickable-" + d);
		TeamBtn.click();
		Thread.sleep(3000);

		String expectedTitle = "Bringing ";
		String actuallyMsg = driver.findElement(By.xpath("//div[@class='card-heading heading']")).getText();
		System.out.println("After clicking on Meet The Team Button , We get Header---" + actuallyMsg);
		if (expectedTitle.contains(actuallyMsg)) {

			System.out.println("It is Header success....In Teams");
		} else if (!expectedTitle.contains(actuallyMsg)) {

			System.out.println("It is fail.... to capture Header success");

		}

		driver.navigate().back();

	}
	public void HowCanHelpYouForm() throws InterruptedException {
		Actions ac = new Actions(driver);
		WebElement NameField = driver.findElement(By.xpath("//input[@id='basic_name']"));
		ac.moveToElement(NameField).build().perform();
		Thread.sleep(2000);
	}
	public void AddVisitorName() {
		// random string of length 8 composed of alphabetic characters
		String VisitorName = RandomStringUtils.randomAlphabetic(8);
		System.out.println("The UserName is .. " + VisitorName);
		driver.findElement(By.xpath("//input[@id='basic_name']")).sendKeys("Ajay" + VisitorName);
	}
	public void AddingVisitorEmail() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		driver.findElement(By.xpath("//input[@id='basic_email']")).sendKeys("ajay" + randomInt + "@gmail.com");
		
	}


	public void AddVisitorPhone() {
		Random r = new Random();

		int i1 = r.nextInt(8); // returns random number between 0 and 7
		int i2 = r.nextInt(8);
		int i3 = r.nextInt(8);
		int i4 = r.nextInt(742); // returns random number between 0 and 741
		int i5 = r.nextInt(10000); // returns random number between 0 and 9999

		String phoneNumber = String.format("%d%d%d%03d%04d", i1, i2, i3, i4, i5);
	
		driver.findElement(By.xpath("//input[@class='form-control ']")).sendKeys(phoneNumber);
	}

	public void EnterMsg(String msg) throws InterruptedException {
		MessageFIELD.sendKeys(msg);
		Thread.sleep(2000);
		SubmitBtn.click();
	}
	
}
