package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(4, Calculator.add("2,2"));
	}
	@Test
    public void testMultipleNumbers(){
    	assertEquals(8, Calculator.add("1,2,5"));
    }
    	@Test
    public void testMultipleNumbers2(){
    	assertEquals(15, Calculator.add("2,5,2,6"));
    }
    @Test
    public void testNewlineNumbers(){
    	assertEquals(6,Calculator.add("1\n2,3"));
    }
   @Test
    public void testNewDeliminator(){
    	assertEquals(3, Calculator.add("//;\n1;2"));

    }
    @Test
    (expected=IllegalArgumentException.class)
        public void testNegativeNumbers(){
            assertEquals("Negatives not allowed: -4, -5", Calculator.add("-4,-5"));
        }
    @Test 
    (expected=IllegalArgumentException.class)
        public void testNegativeException(){
            assertEquals("Negatives not allowed: -200, -100", Calculator.add("-200,-100"));
        }


     @Test
	public void testHighNumbers() {
		assertEquals(2, Calculator.add("1001,2"));
	}

	@Test
	public void testHighNumbers2(){
		assertEquals(4, Calculator.add("2000,4"));
	}

	@Test
	public void TestnewDeliminetor()
	{
		assertEquals(6, Calculator.add("//[***]\n1***2***3"));
	}
	@Test
	public void TestnewlengthyDeliminetor()
	{
		assertEquals(6, Calculator.add("//[$$]\n1$$2$$3"));
	}
	@Test
	public void Testmultipledelimters(){
			assertEquals(6, Calculator.add("//[*][%]\n1*2%3"));
	}
	@Test
	public void Testmultipledelimters2(){
		assertEquals(8, Calculator.add("//[#][!]\n4#3!1"));
	}
		@Test
	public void Testmultipledelimters3(){
		assertEquals(11, Calculator.add("//[>][<]\n4<3>1<3"));
	}

	@Test
	public void Testingdelimeterswithanylenght(){
		assertEquals(10, Calculator.add("//[***][%%%]\n5***3%%%2"));
	}

	@Test
	public void Testingdelimeterswithanylenght2(){
		assertEquals(14, Calculator.add("//[##][&&&&]\n5##3&&&&6"));
	}

	@Test
	public void Testingdelimeterswithanylenght3(){
		assertEquals(16, Calculator.add("//[!!][&]\n5!!3&8"));
	}



}