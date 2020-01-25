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

//implements MathOperations (Substration)
public class AcpSubstration implements MathOperation {
  
    public void operate(Integer firstNumber, Integer secondNumber) {
        Integer subTotal = firstNumber - secondNumber;
        System.out.println(subTotal);
    }
}
