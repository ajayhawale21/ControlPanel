package Test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import BaseB.BaseT;

public class EMagazinePageTest extends BaseT {

	
	@Test(priority=5,dependsOnGroups = { "EventsP" })
	
	public void enteringMagazinePage() throws InterruptedException {
		mgz.MagazineMod();
	}
	
	@Test(priority=6,groups={"EMagazine"})
	public void addingMagazine() throws InterruptedException, AWTException {
		mgz.magazineName();
		mgz.uploadFile();
	}
	
	@Test(priority=7, enabled=true)
	public void editingMagazine() throws InterruptedException {
		mgz.editMagazine();
	}
	
	@Test(priority=8,enabled=true)
	public void deleteMagazine() throws InterruptedException {
		mgz.DeleteMagazine();
	}
	
	@Test(priority=9,enabled=true)
	public void paginationTest() throws InterruptedException {
		mgz.Nextpagination();
		mgz.Backpagination();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
