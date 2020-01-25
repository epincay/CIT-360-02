/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acp;

import java.util.HashMap;

/**
 *
 * @author Eddie Pincay
 */
public class AcpController {
    
    // Create a HashMap to link the string to the MathOperation interface
    public static HashMap<String, MathOperation> hashMapOfOperation = new HashMap<String, MathOperation>();

    public  AcpController() {
    }	
	
    public void handleOperation(String operation, Integer firstNumber, Integer secondNumber) {
        
        // Connection the hashmap key to all class implements
        hashMapOfOperation.put("+", new AcpAddition());
        hashMapOfOperation.put("-", new AcpSubstration());
        hashMapOfOperation.put("*", new AcpMultiplication());
        hashMapOfOperation.put("/", new AcpDivision());

        // Create an instance of the MathOperation class
        MathOperation doMath = hashMapOfOperation.get(operation);

        // Print the results to the main application
        doMath.operate(firstNumber, secondNumber);	

    }
    
}
