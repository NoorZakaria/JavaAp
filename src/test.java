import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;
import java.util.List;
import junit.framework.TestCase;

public class test extends TestCase {
	 @Test
	 
	   public void testAddPass() {
	      // assertEquals(String message, long expected, long actual)
		 
	    assertEquals("error in add()",  3.0, Model.add(1, 2));
	      assertEquals("error in add()", -3.0, Model.add(-1, -2));
	      assertEquals("error in add()",  9.0,Model.add(9, 0));
	   }
	 
	   @Test
	   public void testAddFail() {
	      // assertNotEquals(String message, long expected, long actual)
	      assertNotEquals("error in add()", 0.0, Model.add(1, 2));
	   }
	 
	   @Test
	   public void testSubPass() {
	      assertEquals("error in sub()",  -1.0, Model.sub(2, 1));
	      assertEquals("error in sub()", 1.0, Model.sub(-2, -1));
	      assertEquals("error in sub()",  0.0, Model.sub(2, 2));
	   }
	 
	   @Test
	   public void testSubFail() {
	      assertNotEquals("error in sub()", 0.0, Model.sub(2, 1));
	   }
	  /* @Test
	   public void test1(){
		   assertNotEquals("error in texting()", 1, View.f1()>='0'|| View.f1()<='9');
		   
	   }*/
	   @Test
	   public void testMulPass(){
		   assertEquals("error in mul()",2.0,Model.mul(1, 2));
	   }
	   @Test
	   public void testMulFail(){
		   assertNotEquals("error in mul()",0.0, Model.mul(1, 2));
		
	   } @Test
	   public void testDivIntPass() {
		      assertEquals("error in divInt()", 3.0, Model.div(3, 9));
		     // assertEquals("error in divInt()", 0.0, Model.div(1, 9));
		   }
		 
		   @Test
		   public void testDivIntFail() {
		      assertNotEquals("error in divInt()", 1.0, Model.div(9, 3));
		   }
		 
		   @Test(expected = IllegalArgumentException.class)
		   public void testDivNumByZero() {
		      Model.div(9, 0); // expect an IllegalArgumentException divided by zero
		   }
	   
		   
		   
		   
		 @Test(expected =InputMismatchException.class)
		 public void missmatch(){
         View.f1();			 
		 }
		   
		   
		
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
}
