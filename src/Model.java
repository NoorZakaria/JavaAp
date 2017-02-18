import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Model {
	private static double result;
	
	
	public static double add (double first, double second ){
	
return(	result= first+ second);
	
	}
	public static double div ( double first, double second ){
		
return	result= second/first;
		
		}
	public static double mul ( double first, double second ){
		
	return	result= first* second;
			
			}
	public static double sub ( double first, double second ){
		
	return	result= -first+second;
			
			}
	public static double mod ( double first, double second ){
		
		return result= second%first;
			
			}
	
	
	//public double getValue() {
		//return result;
	//}

  
}
