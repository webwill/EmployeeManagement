/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

/**
 *
 * @author william
 */
public class Employee implements MeetingTimes{
    
    private String name;
    private int phoneNumber;
    public Employee(String name, int phoneNumber){
         this.name = name;
         this.phoneNumber = phoneNumber;
    }
    
    private boolean checkPhoneNumber(int phoneNumber){
        if((phoneNumber+"").length() ==11){
            return true;
        }else{
            return false;
        }
    }
}
