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
public class EmployeeModel {
    private String firstName;
    private String lastName;
    private String department;
    
    // method get FirstName
    public String getFirstName() {
        return firstName;
    }
    
    // method set FirstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    // method get LastName
    public String getLastName() {
        return lastName;
    }
    
    // method set LasttName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    // method get Department
    public String getDepartment() {
        return department;
    }
    
    // method set Department
    public void setDepartment(String department) {
        this.department = department;
    }   
}
