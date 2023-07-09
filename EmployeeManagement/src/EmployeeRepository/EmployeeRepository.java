/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeRepository;

import DBContext.EmployeeDBContext;
import entity.Employee;
import java.util.List;

/**
 *
 * @author Asus
 */
public class EmployeeRepository implements IEmployeeRepository {

    @Override
    public Employee insert(Employee employee) {
        return EmployeeDBContext.getInstance().insert(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return EmployeeDBContext.getInstance().update(employee);
    }

    @Override
    public Employee remove(String id) {
        return EmployeeDBContext.getInstance().remove(id);
    }

    @Override
    public Employee get(String id) {
        return EmployeeDBContext.getInstance().get(id);
    }

    @Override
    public List<Employee> search(String name) {
        return EmployeeDBContext.getInstance().search(name);
    }

    @Override
    public List<Employee> getAll() {
        return EmployeeDBContext.getInstance().getStudents();
    }
    
    
}
