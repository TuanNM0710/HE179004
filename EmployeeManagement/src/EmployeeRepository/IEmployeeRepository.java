/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EmployeeRepository;

import entity.Employee;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IEmployeeRepository {
    
    public Employee insert(Employee employee);
    
    public Employee update(Employee employee);
    
    public Employee remove(String id);
        
    public Employee get(String id);
    
    public List<Employee> search(String name);
    
    public List<Employee> getAll();
}
