import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class controller {
	
private View V;
private Model M;
public controller (View V , Model M){
	this.V = V;
	this.M = M;
	this.V.addCalculateListener(new CalculateListener());
}
	
class CalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            
            double firstNumber, secondNumber = 0;

        
        firstNumber = V.f1();
        secondNumber = V.f2();
        if(e.getSource()==V.jButton1){
        
        	V.setCal(M.add(firstNumber, secondNumber));
        }
        else if (e.getSource()==V.jButton2)
        {
        	V.setCal(M.div(firstNumber, secondNumber));
        }
        
        else if (e.getSource()==V.jButton3)
        {
        	V.setCal(M.sub(firstNumber, secondNumber));
        } else if (e.getSource()==V.jButton4)
        {
        	V.setCal(M.mul(firstNumber, secondNumber));
        }
        else if (e.getSource()==V.jButton5)
        {
        	V.setCal(M.mod(firstNumber, secondNumber));
        }
        
    //    V.setCal(M.getValue());
        }

}


	
	
	
	
	
}
