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
public class Meeting {
    
    Employee eOne,eTwo;
    int startTime, endTime;
    
//    Creates a meeting between two employee!
    public Meeting(Employee eOne, Employee eTwo, int startTime, int endTime){
           this.eOne = eOne;
           this.eTwo = eTwo;
           this.startTime = startTime;
           this.endTime = endTime;
           
           System.out.println("The meeting has being set between " + eOne.getEmployeeName()+ " and "+ eTwo.getEmployeeName());
           System.out.println("The time of the meeting is " + startTime);
    }
    
    
  
}
