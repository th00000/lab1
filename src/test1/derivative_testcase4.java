package test1;

import org.junit.Test;

import junit.framework.TestCase;

public class derivative_testcase4 extends TestCase{
	@Test
	public void test_derivative()
	{
		test1 ce=new test1();
		ce.Build();
		boolean ans=ce.Expression("2*x^3+x*x");
		//System.out.print("ans="+ans);
		ce.Derivative("!d/d x");
		assertEquals(true, ce.co.flag);
	}
}
