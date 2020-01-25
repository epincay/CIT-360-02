/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author Eddie Pincay
 */
public class EmployeeView {
    public void printEmployeeDetails(String firstName, String lastName, String department){
      System.out.println("Poke Employees");
      System.out.println("First Name: " + firstName);
      System.out.println("Last Name: " + lastName);
      System.out.println("Department: " + department);
   }
}
