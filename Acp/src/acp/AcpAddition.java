/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acp;

/**
 *
 * @author Eddie Pincay
 */

//implements MathOperations (Addition)
public class AcpAddition implements MathOperation {
    
    //Addition method
    public void operate(Integer firstNumber, Integer secondNumber) {
        Integer addTotal = firstNumber + secondNumber;
        System.out.println(addTotal);
    }
}
