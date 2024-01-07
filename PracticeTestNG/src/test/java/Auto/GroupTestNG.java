package Auto;

import org.testng.annotations.Test;


@Test(groups= {"all"})
public class GroupTestNG {
	
	@Test(groups= {"Smoke","functional"})
	public static void Test1() {
		System.out.println("Test1");
	}
	
	@Test(groups= {"Smoke"})
	public static void Test2() {
		System.out.println("Test2");
	}
	
	@Test(groups= {"sanity","regression"})
	public static void Test3() {
		System.out.println("Test3");
	}
	
	@Test(groups= {"regression"})
	public static void Test4() {
		System.out.println("Test4");
	}
	
	@Test(groups= {"functional","sanity","regression"})
	public static void Test5() {
		System.out.println("Test5");
	}
	
	@Test(groups= {"functional"})
	public static void Test6() {
		System.out.println("Test6");
	}
	
	@Test(groups= {"Smoke","functional","sanity","regression"})
	public static void Test7() {
		System.out.println("Test7");
	}

}
