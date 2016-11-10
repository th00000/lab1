package test1;

import org.junit.Test;

import junit.framework.TestCase;

public class expression_testcase1 extends TestCase{
	@Test
	public void test_Expression()
	{
		test1 ce=new test1();
		ce.Build();
		boolean ans=ce.Expression("123+2*x+3*x*y");
		System.out.println(ans);
		assertEquals(true, ans);
	}
}
