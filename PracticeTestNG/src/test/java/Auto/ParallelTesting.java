package Auto;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ParallelTesting {
	@Test
	public void method1() {
		System.out.println("method1" + " " + Thread.currentThread().getId());
		Assert.assertTrue(false);
	}

	@Test
	public void method2() {
		System.out.println("method2" + " " + Thread.currentThread().getId());
	}

}

class TestCase2 {
	@Test
	public void method3() {
		System.out.println("method3" + " " + Thread.currentThread().getId());
	}

	@Test
	public void method4() {
		System.out.println("method4" + " " + Thread.currentThread().getId());
	}

}

class TestCase3 {
	@Test(invocationCount = 100, invocationTimeOut=5000, threadPoolSize = 3 )
	public void method5() {
		System.out.println("method5" + " " + Thread.currentThread().getId());
	}

	@Test
	public void method6() {
		System.out.println("method6" + " " + Thread.currentThread().getId());
	}
}

class TestCase4 {
	@Test
	public void method7() {
		System.out.println("method7" + " " + Thread.currentThread().getId());
	}

	@Test
	public void method8() {
		System.out.println("method8" + " " + Thread.currentThread().getId());
	}
}

class TestCase5 {
	@Test
	public void method9() {
		System.out.println("method9" + " " + Thread.currentThread().getId());
	}

	@Test
	public void method10() {
		System.out.println("method10" + " " + Thread.currentThread().getId());
	}
}

class TestCase6 {
	@Test
	public void method11() {
		System.out.println("method11" + " " + Thread.currentThread().getId());
	}

	@Test
	public void method12() {
		System.out.println("method12" + " " + Thread.currentThread().getId());
	}
}
