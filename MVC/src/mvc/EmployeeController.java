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
public class EmployeeController {
    private EmployeeModel model;
    private EmployeeView view;
   
    public EmployeeController(EmployeeModel model, EmployeeView view){
       this.model = model;
       this.view = view;
    }
   
    public void setFirstName(String firstName){
       model.setFirstName(firstName);		
    }
    public String getFirstName(){
       return model.getFirstName();		
    }
    public void setLastName(String lastName){
       model.setLastName(lastName);		
    }
    public String getLastName(){
       return model.getLastName();
    }
    public void setDepartment(String department){
       model.setDepartment(department);		
    }
    public String getDepartment(){
       return model.getDepartment();
    }
    public void updateView(){				
       view.printEmployeeDetails(model.getFirstName(), model.getLastName(), model.getDepartment());
    }
}
