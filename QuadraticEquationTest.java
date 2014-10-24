import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class QuadraticEquationTest {

	@Test
	public void testCase1() {
		QuadraticEquation object_quEquation = new QuadraticEquation();
		String result1 = object_quEquation.GiaiPT(0, 2, 3);
		Assert.assertEquals("Error value of a", result1);
	}
	@Test
	public void testCase2() {
		QuadraticEquation object_quEquation = new QuadraticEquation();
		String result1 = object_quEquation.GiaiPT(-3, 2, 1);
		Assert.assertEquals("Equation have value of x1 = 1 and value of x2 = -0.3333333333333333", result1);
	}
	
	@Test
	public void testCase3() {
		QuadraticEquation object_quEquation = new QuadraticEquation();
		String result1 = object_quEquation.GiaiPT(2, 3, 1);
		Assert.assertEquals("Equation have value of x1 = -1 and value of x2 = -0.5", result1);
	}
	
	@Test
	public void testCase4() {
		QuadraticEquation object_quEquation = new QuadraticEquation();
		String result1 = object_quEquation.GiaiPT(3, 2, 1);
		Assert.assertEquals("Equation have no values of x1 and x2", result1);
	}
	
	@Test
	public void testCase5() {
		QuadraticEquation object_quEquation = new QuadraticEquation();
		String result1 = object_quEquation.GiaiPT(2, 4, 2);
		Assert.assertEquals("Equation have value of x1 = -1 and value of x2 = -1.0", result1);
	}
	
	@Test
	public void testCase6() {
		QuadraticEquation object_quEquation = new QuadraticEquation();
		String result1 = object_quEquation.GiaiPT(2, 4, 1);
		Assert.assertEquals("Equation have x1 = -1.7071067811865475and have x2 = -0.2928932188134524", result1);
	}

	
}
