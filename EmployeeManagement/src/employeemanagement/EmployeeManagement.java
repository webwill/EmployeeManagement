/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employeemanagement;

import java.util.Scanner;
/**
 *
 * @author william
 */
public class EmployeeManagement {

    /**
     * @param args the command line arguments
     */
    
    static Scanner sc =  new Scanner(System.in);
    
    public static void main(String[] args) {
        Employee employee = null;
        
        System.out.print("Enter new employees name:");
        String name = sc.next();
        if (name.length() >0) {
             System.out.println("The new employee name is " + name);
        }else{
            System.err.println("name is leaved empty");
        }
        System.out.print("Enter new employees phone number:");
        int phone = Integer.parseInt(sc.next());
        
        System.out.print("Enter type of role [1 - Engineer] [2 - Management] [3 - HR]");
        int role = Integer.parseInt(sc.next());
        
        switch (role){
            case 1:
                employee = new Engineer(name,phone);
                System.out.println("Engineer Created");
                break;
            case 2:
                employee = new Mangement(name,phone);
                System.out.println("Mangement Created");
                break;
            case 3:
                employee = new Hr(name,phone);
                System.out.println("HR Created");
                break;
        }                 
                        
    }
    
    

}
