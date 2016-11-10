package test1;

import org.junit.Test;

import junit.framework.TestCase;

public class derivative_testcase3 extends TestCase{
	@Test
	public void test_derivative()
	{
		test1 ce=new test1();
		ce.Build();
		boolean ans=ce.Expression("2*x*y+3*y");
		//System.out.print("ans="+ans);
		ce.Derivative("!d/d z");
		assertEquals(true, ce.co.flag);
	}
}
