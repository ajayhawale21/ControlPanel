package Test;

import org.testng.annotations.Test;

import BaseB.BaseT;

public class TechMobilityTest extends BaseT {

	@Test(priority = 27, enabled = true, groups={"Mobility"}, dependsOnGroups = { "GetInTouch" })
	public void EnteringInMobility() throws InterruptedException {
		tm.EnterInTecnology();
		tm.ReadMoreBtnTest();

	}
}
