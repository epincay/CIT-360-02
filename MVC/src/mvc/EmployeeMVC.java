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
public class EmployeeMVC {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        EmployeeModel model  = retrieveEmployeeFromDatabase();

        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
    }

    private static EmployeeModel retrieveEmployeeFromDatabase(){
        EmployeeModel employee = new EmployeeModel();
        employee.setFirstName("Eddie");
        employee.setLastName("Pincay");
        employee.setDepartment("Evolutions");
        return employee;
     }    
}
