package PageOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechMobility {
WebDriver driver;

@FindBy(xpath="(//a[@href='/technology'])[1]")
WebElement TechnologySection;

@FindBy (xpath="//h1[@class='title heading']")
WebElement FourHeadings;

@FindBy (xpath="//button[@class='ant-btn ant-btn-default card-button']")     //(//button[@class='ant-btn ant-btn-default card-button'])[1]
WebElement KonwMoreBtns;

@FindBy (xpath="(//button[@class='ant-btn ant-btn-default card-button'])[1]")   // title
WebElement SafetyReadMoreBtn;

@FindBy (xpath="(//button[@class='ant-btn ant-btn-default card-button'])[2]")     // title
WebElement SteeringReadMoreBtn;

@FindBy (xpath="(//button[@class='ant-btn ant-btn-default card-button'])[3]")     // title
WebElement DriverReadMoreBtn;

@FindBy (xpath="(//button[@class='ant-btn ant-btn-default card-button'])[4]")     // title
WebElement InfotainmentReadMoreBtn;

@FindBy(xpath="//button[@class='ant-btn ant-btn-outline card-button']")           // title
WebElement ExploreTechnologyBtn;






public TechMobility(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void EnterInTecnology() throws InterruptedException {
	TechnologySection.click();
	Thread.sleep(3000);
	int size=driver.findElements(By.xpath("//h1[@class='title heading']")).size();
	System.out.println("Total Headinds are -"+size);
for(int i=0;i<size;i++) {
	String Headings=driver.findElements(By.xpath("//h1[@class='title heading']")).get(i).getText();
	System.out.println("Headings are :"+Headings);
}
}

public void ReadMoreBtnTest() throws InterruptedException {
	SafetyReadMoreBtn.click();
	Thread.sleep(5000);
	String TitleOne= driver.getTitle();
	System.out.println("TitleOne");
	ExploreTechnologyBtn.click();
	String TechTitleOne=driver.getTitle();
	System.out.println("After clicking on Safety systems-Explore The Technology behind-Title comes--"+TechTitleOne);
	driver.navigate().back();
	Thread.sleep(4000);
	                         //Second Read more Btn
	SteeringReadMoreBtn.click();
	Thread.sleep(4000);
	String TitleTwo= driver.getTitle();
	System.out.println("TitleTwo");
	ExploreTechnologyBtn.click();
	String TechTitleTwo=driver.getTitle();
	System.out.println("After clicking on Steering solutions -Explore The Technology behind-Title comes--"+TechTitleTwo);
	driver.navigate().back();
	Thread.sleep(4000);
	
	 //Third Read more Btn
	DriverReadMoreBtn.click();
		Thread.sleep(4000);
		String TitleThree= driver.getTitle();
		System.out.println("TitleThree");
		ExploreTechnologyBtn.click();
		String TechTitleThree=driver.getTitle();
		System.out.println("After clicking on Driver Assistance -Explore The Technology behind-Title comes--"+TechTitleThree);
		driver.navigate().back();
		Thread.sleep(4000);
	
		 //Four Read more Btn
		InfotainmentReadMoreBtn.click();
		Thread.sleep(4000);
		String TitleFour= driver.getTitle();
		System.out.println("TitleFour");
		ExploreTechnologyBtn.click();
		String TechTitleFour=driver.getTitle();
		System.out.println("After clicking on Infotainment -Explore The Technology behind-Title comes--"+TechTitleFour);
		driver.navigate().back();
		Thread.sleep(4000);
	
}










}
