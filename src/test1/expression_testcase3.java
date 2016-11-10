package test1;

import org.junit.Test;

import junit.framework.TestCase;

public class expression_testcase3 extends TestCase{
	@Test
	public void test_Expression()
	{
		test1 ce=new test1();
		ce.Build();
		boolean ans=ce.Expression("%+123");
		System.out.println(ans);
		assertEquals(false, ans);
	}
}
