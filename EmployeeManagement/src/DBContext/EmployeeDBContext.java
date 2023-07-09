/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBContext;

import entity.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author Asus
 */
public class EmployeeDBContext {
    public List<Employee> employees = new ArrayList<Employee>() {
        {
            add(new Employee("FPT2468","Nguyen Van A", 3, "SE"));
            add(new Employee("FPT1245","Nguyen Van B", 3, "IS"));
        }
        
    };
    
    private static EmployeeDBContext instance = null;
    
    private EmployeeDBContext() {
        
    }
    
    public static synchronized EmployeeDBContext getInstance() {
        if (instance == null) {
            instance = new EmployeeDBContext();
        }
        return instance;
    }
    
    public void close() {
        instance = null;
        System.gc();
    }
    
    public Employee insert(Employee employee) {
        if (get(employee.getEmployeeID()) != null) return null;
        if (!Pattern.compile("(^FPT)([0-9]{4}$)").matcher(employee.getEmployeeID().toUpperCase()).find() || employee.getEmployeeID().length() != 7) return null;
        if (Pattern.compile("[^A-Z ]").matcher(employee.getEmployeeName().toUpperCase()).find()) return null;
        if (!employee.getDepartment().equalsIgnoreCase("SE") && !employee.getDepartment().equalsIgnoreCase("IOT") && !employee.getDepartment().equalsIgnoreCase("IS")) return null;
        if (employee.getExperience() < 2 || employee.getExperience() > 30) return null;
        employees.add(employee);
        return get(employee.getEmployeeID());
    }
    
    public Employee update(Employee employee) {
        Employee oldEmployee = get(employee.getEmployeeID());
        
        if (oldEmployee == null) return null;
        if (!oldEmployee.getEmployeeName().equalsIgnoreCase(employee.getEmployeeName())) return null;
        if (oldEmployee.equals(employee)) return null;
        if (!Pattern.compile("(^FPT)([0-9]{4}$)").matcher(employee.getEmployeeID().toUpperCase()).find() || employee.getEmployeeID().length() != 7) return null;
        if (Pattern.compile("[^A-Z ]").matcher(employee.getEmployeeName().toUpperCase()).find()) return null;
        if (!employee.getDepartment().toLowerCase().equals("se") && !employee.getDepartment().toLowerCase().equals("is") && !employee.getDepartment().toLowerCase().equals("iot")) return null;
        if (employee.getExperience() < 2 || employee.getExperience() > 30) return null;
        oldEmployee.setEmployeeID(employee.getEmployeeID());
        oldEmployee.setEmployeeName(employee.getEmployeeName());
        oldEmployee.setExperience(employee.getExperience());
        oldEmployee.setDepartment(employee.getDepartment());
        return get(employee.getEmployeeID());
    }
    
    public Employee remove(String id) {
        Employee employee = get(id);
        if (employee == null) return null;
        employees.remove(employee);
        return employee;
    }
    
    public Employee get(String id) {
        Employee ret = null;
        for (Employee employee : employees) {
            if (employee.getEmployeeID().equalsIgnoreCase(id)) {
                ret = employee;
                break;
            }
        }
        return ret;
    }
    
    public List<Employee> search(String name) {
        List<Employee> employeeWithName = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getEmployeeName().toLowerCase().contains(name.toLowerCase())) {
                employeeWithName.add(employee);
            }
        }
        return employeeWithName;
    }
    
    public List<Employee> getStudents() {
        return employees;
    }
}
