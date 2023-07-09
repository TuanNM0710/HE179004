/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EmployeeManagement;

import DBContext.EmployeeDBContext;
import EmployeeRepository.IEmployeeRepository;
import EmployeeRepository.EmployeeRepository;

/**
 *
 * @author Asus
 */
public class EmployeeManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IEmployeeRepository repo = new EmployeeRepository();
        
        System.out.println(repo.getAll());
        EmployeeDBContext.getInstance().close();
    }
    
}
