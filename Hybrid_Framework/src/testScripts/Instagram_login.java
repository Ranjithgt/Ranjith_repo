package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Fetch_data;
import generic.Generic;
import pom.InstaPom;

public class Instagram_login extends Generic {

	@Test
	public void actitime() throws InterruptedException
	{
		String un = Fetch_data.data("Sheet1", 0, 0);
		String pwd = Fetch_data.data("Sheet1", 0, 1);
		
		InstaPom p=new InstaPom(driver);
		p.username(un);
		Assert.fail();
		p.password(pwd);
		p.login();
		Thread.sleep(3000);
		
	}
}
