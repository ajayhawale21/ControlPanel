package PageOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechConnectivity {
	WebDriver driver;

	@FindBy(xpath = "(//a[@href='/technology/connectivity'])[1]")
	WebElement ConectivityMod;

	@FindBy(xpath = "(//button[@type='button'])[1]")
	WebElement KnowMoreBtn;// Tech stack

	// Footers tagname

	@FindBy(xpath = "(//a[@class='footer-links grey'])[1]")
	WebElement OurStorySection;

	@FindBy(xpath = "(//a[@class='footer-links grey'])[2]")
	WebElement TeamsSection;

	@FindBy(xpath = "(//a[@class='footer-links grey'])[3]")
	WebElement JoinUsSection;

	@FindBy(xpath = "(//a[@class='footer-links grey'])[4]")
	WebElement GetInTouchSection;

	@FindBy(xpath = "(//a[@class='footer-links grey'])[5]")
	WebElement MobilitySection;

	@FindBy(xpath = "(//a[@class='footer-links grey'])[6]")
	WebElement ConnectivitySection;

	// Social Media

	@FindBy(xpath = "(//li[@class='footer-media-tag'])[1]")
	WebElement FbIcon;

	@FindBy(xpath = "(//li[@class='footer-media-tag'])[2]")
	WebElement LinkLnIcon;

	@FindBy(xpath = "(//li[@class='footer-media-tag'])[3]")
	WebElement TwitterIcon;
	
	
	@FindBy(xpath="//button[@class='ant-btn ant-btn-default footer-sign-in primary']")
	WebElement SignInBtn;
	

	@FindBy(xpath = "(//a[@class='footer-links grey'])[7]")
	WebElement PrivacyLink;

	@FindBy(xpath = "(//a[@class='footer-links grey'])[8]")
	WebElement TermsConditionLink;

	@FindBy(xpath = "(//a[@class='footer-links grey'])[9]")
	WebElement SecurityLink;

	public TechConnectivity(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void EnterInConnectivity() throws InterruptedException {
		ConectivityMod.click();
		System.out.println("Enter in Technology Connectivity ");
		String Title = driver.getTitle();
		System.out.println(" Title of connectivity page is" + Title);
		boolean a = KnowMoreBtn.isEnabled();
		System.out.println("Connectivity know more button is enabled- " + a);
		KnowMoreBtn.click();
		Thread.sleep(3000);
		String titleOfPage = driver.getTitle();
		System.out.println("Title of page-" + titleOfPage);
		driver.navigate().back();

	}
	public void FootersTest() throws InterruptedException {
		boolean d=OurStorySection.isEnabled();
		System.out.println("OurStorySection is clickable");
		Thread.sleep(1000);
		boolean e=TeamsSection.isEnabled();
		System.out.println("TeamsSection is clickable");
		Thread.sleep(1000);
		boolean f=JoinUsSection.isEnabled();
		System.out.println("JoinUsSection is clickable");
		Thread.sleep(1000);
		boolean i=GetInTouchSection.isEnabled();
		System.out.println("GetInTouchSection is clickable");
		Thread.sleep(1000);
		boolean j=MobilitySection.isEnabled();
		System.out.println("MobilitySection is clickable");
		Thread.sleep(1000);
		boolean k=ConnectivitySection.isEnabled();
		System.out.println("ConnectivitySection is clickable");
		Thread.sleep(1000);
		
		
		FbIcon.click();
		String FbTitle=driver.getTitle();
		System.out.println("Title of facebook Page-"+FbTitle);
		driver.navigate().back();
		Thread.sleep(6000);
		Actions act=new Actions(driver);
		act.moveToElement(LinkLnIcon).build().perform();
		
		LinkLnIcon.click();
		String LinkLnTitle=driver.getTitle();
		System.out.println("Title of LinkLn Page-"+LinkLnTitle);
		driver.navigate().back();
		Thread.sleep(6000);
		
		Actions ac=new Actions(driver);
		ac.moveToElement(LinkLnIcon).build().perform();
		
		
		TwitterIcon.click();
		String TwtTitle=driver.getTitle();
		System.out.println("Title of Twitter Page-"+TwtTitle);
		driver.navigate().back();
		Thread.sleep(6000);
		Actions acn=new Actions(driver);
		acn.moveToElement(SignInBtn).build().perform();
		SignInBtn.click();
		Thread.sleep(5000);
	String PortalTitle=	driver.getTitle();
	if(PortalTitle.contains("Brigosha")) {
		System.out.println("Title of page- Brigosha Technologies.");
	}
	
		
		
	}

}
