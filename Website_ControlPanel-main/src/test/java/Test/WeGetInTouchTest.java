package Test;

import org.testng.annotations.Test;

import BaseB.BaseT;

public class WeGetInTouchTest extends BaseT {

	@Test(priority=26, groups={"GetInTouch"}, dependsOnGroups = { "JoinUs" })
	
	public void GITFormFilling() throws InterruptedException {
		wgit.FillingFomGIT(BaseT.ReadConfig("NameV"), BaseT.ReadConfig("EmailV"), BaseT.ReadConfig("PhoneV"), BaseT.ReadConfig("Messagev"));
	}
	
	
	
	
	
}
