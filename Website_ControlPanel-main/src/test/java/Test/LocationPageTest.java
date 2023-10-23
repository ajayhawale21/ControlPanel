package Test;

import org.testng.annotations.Test;

import BaseB.BaseT;

public class LocationPageTest extends BaseT {

	@Test(priority = 10, dependsOnGroups = { "EMagazine" })
	public void enteringLoc() throws InterruptedException {
		lc.LocationMod();

		lc.AddOfficeType();
		lc.AddLocation();
		lc.addingAddress(BaseT.ReadConfig("address"));
		lc.AddOfficePhone();

	}

	@Test(priority = 11, enabled = true, groups = { "Locations" })
	public void Editloc() throws InterruptedException {
		lc.editLocation(BaseT.ReadConfig("Description"));
	}

	@Test(priority = 12, enabled = true)
	public void deleteLoc() throws InterruptedException {
		lc.deleteLoc();
	}

	@Test(priority = 13, enabled = true)
	public void paginationTest() throws InterruptedException {
		lc.Nextpagination();
		lc.Backpagination();
	}

}
