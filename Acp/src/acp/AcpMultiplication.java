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

//implements MathOperations (Multiplication)
public class AcpMultiplication implements MathOperation {
    
    public void operate(Integer firstNumber, Integer secondNumber) {
        Integer mulTotal = firstNumber * secondNumber;
        System.out.println(mulTotal);
    }
}
