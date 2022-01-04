package Test;


import org.testng.annotations.Test;

import extentListeners.Listeners;

public class DashBoardTest extends Listeners{
	
	
	@Test(priority = 3)
	public void selectShare()
	{
		test.info("search shares");
		db.searchShare();
	}
	
	

}
