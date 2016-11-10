package test1;

import org.junit.Test;

import junit.framework.TestCase;

public class expression_testcase4 extends TestCase{
	@Test
	public void test_Expression()
	{
		test1 ce=new test1();
		ce.Build();
		boolean ans=ce.Expression("2*2+x^2+y");
		System.out.println(ans);
		assertEquals(true, ans);
	}
}
