package com.automation.testcases.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.helper.Helper;
import com.aventstack.extentreports.Status;

public class TestCase2 extends Helper{

	
	@Test
	public void Testcase_Google3() {
		test = extent.createTest("Testcase_Google3", "Sample test passed to generate report");
		Assert.assertEquals("abcd", "abcd");
		test.log(Status.INFO, "Passed test");
	}
}
