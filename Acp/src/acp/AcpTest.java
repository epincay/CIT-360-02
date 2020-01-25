/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acp;
import java.util.Scanner;

/**
 *
 * @author Eddie Pincay
 */
public class AcpTest {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AcpController apcControl = new AcpController();
        
        Integer firstNumber;
        Integer secondNumber;
        String operation;

        Scanner in = new Scanner(System.in);

        System.out.println("Application Controller Pattern (Math Calculation)");
        
        // Enter firtNumber
        System.out.println("Enter the first number: ");
        try{
            firstNumber = Integer.parseInt(in.nextLine());  
        } catch(NumberFormatException e){
            firstNumber = 0;
        }
        
        // Enter logical operator  
        System.out.println("Enter the operation: \n Addition (+), Subtration (-), Multiplication (*), or Dividision (/)");
        operation = in.nextLine();
        
        char c = operation.charAt(0);
        
        if ((c == '+') || (c == '-') || (c == '*') || (c == '/')) {
            System.out.println("Logic operator entered correctly");
        } else {
            System.out.println("\nERROR: Logic operator entered incorrectly.");
            return;
        }
        
        
        System.out.println("Enter the second number: ");
        try{
            secondNumber = Integer.parseInt(in.nextLine()); 
        } catch(NumberFormatException e){
            secondNumber = 0;
        }
        
        
        
        if(firstNumber < -1) {
            System.out.println("\nERROR: FIRST NUMBER MUST BE 0 OR GREATER THAN 0");
            return;
        } else if(secondNumber <= 0) {
            System.out.println("\nERROR: SECOND NUMBER MUST BE GREATHER THAN 0");
            return;
        }
        
        System.out.println("\nRESULT: " + firstNumber + " " + operation + " " + secondNumber + " = ");
        apcControl.handleOperation(operation, firstNumber, secondNumber);
    }
}
