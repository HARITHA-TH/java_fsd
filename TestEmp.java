package ust_batch_3.testng_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmp {
	
	@Test
	public void test(){
		Emp e=  new Emp("hari",22,"trainee");
		Assert.assertEquals(e.getAge(), 22);
	}
}
