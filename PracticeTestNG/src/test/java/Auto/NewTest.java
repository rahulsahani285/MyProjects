package Auto;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {

	@Parameters({"name","sirname"})
	
	@Test(enabled=true, groups = {"smoke","regressoin","sanity"}, priority = -1)
	public void TestMethod1(@Optional("Priya")   String name, @Optional("sahani")  String sirname) {
		System.out.println(name + " " + sirname);
	}
	
	@Test(priority=0)
	public void TestMethod3() {
		System.out.println("Test method 3");
	}
	
	

	@Parameters({"name","sirname"})
	@Test(groups= {"sanity","functional"}, priority=-2)
	public void TestMethod2(@Optional("Rahul") String a, @Optional("Nishad") String b) {
		System.out.println(a+" "+b);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");

	}

}
