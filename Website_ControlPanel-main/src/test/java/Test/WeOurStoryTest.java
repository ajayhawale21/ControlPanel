package Test;

import org.testng.annotations.Test;

import BaseB.BaseT;

public class WeOurStoryTest extends BaseT{
	@Test(priority=14, dependsOnGroups = { "Locations" })
	public void MainPage() throws InterruptedException {
		wos.Logodisplay();
		wos.WeModuleDisplay();
		wos.GetInTouchBtnClick();
		
	}
	@Test(priority=15)
	public void LeranMoreBtns() {
		wos.AutomLearnMoreBtns();
		wos.IOTLearnMoreBtn();
	}

	@Test(priority=16, groups={"OurStory"})
	
	public void EventSection() throws InterruptedException {
		wos.EventsCards();
		wos.EnterInEvent();
	}
	
	@Test(priority=17)
	public void ViewEvents() throws InterruptedException {
		wos.AllEvents();
	}
	
	@Test(priority=18)
	public void ViewMagazine() throws InterruptedException {
		wos.ViewingEMagazine();
		wos.OpenEMagazine();
	}
	@Test(priority=19)
	public void MeetTeamsection() throws InterruptedException {
		wos.MeetTeam();
	}
	@Test(priority=20)
	public void FormFilling() throws InterruptedException {
		wos.HowCanHelpYouForm();
		wos.AddVisitorName();
		wos.AddingVisitorEmail();
		wos.AddVisitorPhone();
		wos.EnterMsg(BaseT.ReadConfig("msg"));
		
	}
}
