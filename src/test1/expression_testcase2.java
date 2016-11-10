package test1;

import org.junit.Test;

import junit.framework.TestCase;

public class expression_testcase2 extends TestCase{
	@Test
	public void test_Expression()
	{
		test1 ce=new test1();
		ce.Build();
		boolean ans=ce.Expression("xx+123");
		assertEquals(false, ans);
	}
}
