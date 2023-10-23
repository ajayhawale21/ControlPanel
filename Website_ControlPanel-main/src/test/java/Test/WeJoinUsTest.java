package Test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import BaseB.BaseT;

public class WeJoinUsTest extends BaseT {

	@Test(priority = 24, dependsOnGroups = { "EventsP" })
	public void EnterInJoinUs() throws InterruptedException {
		wj.enterInJoinUsMod();
		wj.JobCardsCount();
		wj.applyingJob();
		wj.Pagination();
	}

	@Test(priority = 25, groups={"JoinUs"})
	public void applyinhOnJob() throws InterruptedException, AWTException {
		wj.applyingJobForm(BaseT.ReadConfig("JobTitle"), BaseT.ReadConfig("CandName"), BaseT.ReadConfig("CandEmail"),
				BaseT.ReadConfig("CandPhone"), BaseT.ReadConfig("CurrentOrg"));
		wj.UploadResume();
	}

}
