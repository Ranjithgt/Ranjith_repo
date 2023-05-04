package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Fetch_data;
import generic.Generic;
import pom.Pom;

public class Facebook_login extends Generic {

	@Test
	public void facebook()
	{
		String un = Fetch_data.data("Sheet1", 0, 0);
		String pdw = Fetch_data.data("Sheet1", 0, 1);
		
		Pom p=new Pom(driver);
		p.userName(un);
		Assert.fail();
		p.password(pdw);
		p.login();
	}
}
