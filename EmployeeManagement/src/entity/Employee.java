/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Asus
 */
public class Employee {
    private String EmployeeID;
    private String EmployeeName;
    private int Experience;
    private String department;

    public Employee() {
    }

    public Employee(String EmployeeID, String EmployeeName, int Experience, String department) {
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;
        this.Experience = Experience;
        this.department = department;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.EmployeeID = employeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.EmployeeName = employeeName;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int experience) {
        this.Experience = experience;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + EmployeeID + ", name=" + EmployeeName + ", semester=" + Experience + ", course=" + department + '}';
    }
    
    public boolean equals(Employee employee) {
        return (this.getEmployeeID().equalsIgnoreCase(employee.getEmployeeID()) && this.getEmployeeName().equalsIgnoreCase(employee.getEmployeeName())
                && this.getExperience()== employee.getExperience() && this.getDepartment().equalsIgnoreCase(employee.getDepartment()));
    }  
    
}
