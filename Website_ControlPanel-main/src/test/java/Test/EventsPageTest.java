package Test;

import java.awt.AWTException;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import BaseB.BaseT;

public class EventsPageTest extends BaseT {

	@Test(priority = 0)
	public void displayLogo() {
		ev.logoDisplay();
	}

	
	@Test(priority = 1)
	public void EventsAdd() throws InterruptedException, AWTException {
		ev.enterEventsMod();
		ev.AddEventName();
		ev.uploadFile();

		System.out.println(" Events Fully Created");
	}

	
	@Test(priority = 2,groups={"EventsP"})
	public void EventsEdit() throws InterruptedException {
		ev.editEvent();
	}
	
	@Test(priority = 3, enabled=true)
	public void EventsDelete() throws InterruptedException {
		ev.deleteEvent();
	}
	
	@Test(priority = 4, enabled=true)
	public void PaginationTest() throws InterruptedException {
		ev.pagination();
	}

}
