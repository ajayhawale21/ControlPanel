package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseB.BaseT;

public class WeTeamsTest extends BaseT{
	
	

	@Test(priority=21, dependsOnGroups = { "OurStory" })
	public void EnterInTeamMod() {
		wt.EnterTeamsMod();
		wt.JoinUsbt();
		
	}
	@Test(priority=22, groups={"Teams"})
public void EnterInIlinkIn() throws InterruptedException {
		wt.CEOLinkInAcc();
		
	}
	@Test(priority=23)
	public void DisplayingGallery() {
		wt.GalleryPhotos();
	}
	
	
	
	
	
	
	
	
}
