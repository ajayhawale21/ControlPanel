package PageOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeTeams {
	WebDriver driver;

	@FindBy(xpath = "(//a[@href='/teams'])[1]")
	WebElement TeamsModule;

	@FindBy(xpath = "(//a[@href='/join-us'])[3]")
	WebElement JoinUsBtn;// is enabled. click . back

	@FindBy(xpath = "//div[@class='sc-fLlhyt jCYhGy']")
	WebElement LinkInCards;

	@FindBy(xpath = "(//span[@class='anticon anticon-linkedin'])[1]")
	WebElement BSLinkLn; // click & back

	@FindBy(xpath = "//DIV[@CLASS='gallery-heading title']")
	WebElement GalleryTitle;

	public WeTeams(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void EnterTeamsMod() {
		TeamsModule.click();
		System.out.println("Enter in Teams Module.");
	}

	public void JoinUsbt() {
		boolean e = JoinUsBtn.isEnabled();
		System.out.println("Join Us button is clickable-" + e);
		JoinUsBtn.click();
		driver.navigate().back();

	}

	public void CEOLinkInAcc() throws InterruptedException {
		Actions ac = new Actions(driver);
		WebElement EMagazine = driver.findElement(By.xpath("(//span[@class='anticon anticon-linkedin'])[1]"));
		ac.moveToElement(EMagazine).build().perform();
		Thread.sleep(2000);
		boolean e = BSLinkLn.isEnabled();
		System.out.println("LinkIn Button is clickable-" + e);
		BSLinkLn.click();
		String Title = driver.getTitle();
		System.out.println("The title of LinkIn page is- " + Title);
		driver.navigate().back();
	}

	public void GalleryPhotos() {
		boolean f = GalleryTitle.isDisplayed();
		System.out.println("Gallery photos are displaying in teams Page-" + f);

	}

}
