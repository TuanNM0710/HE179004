/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package StudentRepository;

import DBContext.EmployeeDBContext;
import entity.Employee;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;

import static org.junit.Assert.*;

import EmployeeRepository.IEmployeeRepository;
import EmployeeRepository.EmployeeRepository;

/**
 * @author Asus
 */
public class Insert {

    public Insert() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void TC01() {
        String id = "FPT1720";
        String name = "Nguyen Van A";
        int experience = 5;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee insertedEmployee = repo.insert(employee);

        boolean testResult = (insertedEmployee == null ? false : insertedEmployee.equals(employee));
        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC02() {
        String id = "FPT720";
        String name = "Nguyen Van A";
        int experience = 30;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee insertedEmployee = repo.insert(employee);

        boolean testResult = (insertedEmployee == null ? false : insertedEmployee.equals(employee));
        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC03() {
        String id = "FPTe720";
        String name = "Nguyen Van A";
        int experience = 1;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee insertedEmployee = repo.insert(employee);

        boolean testResult = (insertedEmployee == null ? false : insertedEmployee.equals(employee));
        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC04() {
        String id = "fpt1720";
        String name = "Nguyen Van A";
        int experience = 5;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee insertedEmployee = repo.insert(employee);

        boolean testResult = (insertedEmployee == null ? false : insertedEmployee.equals(employee));
        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC05() {
        String id = "FPT1234";
        String name = "Nguyen Van A";
        int experience = 31;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee insertedEmployee = repo.insert(employee);

        boolean testResult = (insertedEmployee == null ? false : insertedEmployee.equals(employee));
        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC06() {
        String id = "FPT17200";
        String name = "Nguyen Van A";
        int experience = 0;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee insertedEmployee = repo.insert(employee);

        boolean testResult = (insertedEmployee == null ? false : insertedEmployee.equals(employee));
        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC07() {
        String id = "FPT1720";
        String name = "Mark Cuban";
        int experience = 5;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee insertedEmployee = repo.insert(employee);

        boolean testResult = (insertedEmployee == null ? false : insertedEmployee.equals(employee));
        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC08() {
        String id = "FPT1720";
        String name = "Nguyen Van 10";
        int experience = 1;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee insertedEmployee = repo.insert(employee);

        boolean testResult = (insertedEmployee == null ? false : insertedEmployee.equals(employee));
        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC09() {
        String id = "FPT1720";
        String name = "nguyen van a";
        int experience = 30;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee insertedEmployee = repo.insert(employee);

        boolean testResult = (insertedEmployee == null ? false : insertedEmployee.equals(employee));
        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC10() {
        String id = "FPT1720";
        String name = "Nguyen Van A";
        int experience = 0;
        String department = "Java Team";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee insertedEmployee = repo.insert(employee);

        boolean testResult = (insertedEmployee == null ? false : insertedEmployee.equals(employee));
        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC11() {
        String id = "FPT1720";
        String name = "Nguyen Van A";
        int experience = 2;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee insertedEmployee = repo.insert(employee);

        boolean testResult = (insertedEmployee == null ? false : insertedEmployee.equals(employee));
        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC12() {
        String id = "FPT1720";
        String name = "Nguyen Van A";
        int experience = 9;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee insertedEmployee = repo.insert(employee);

        boolean testResult = (insertedEmployee == null ? false : insertedEmployee.equals(employee));
        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC13() {
        String id = "FPT1720";
        String name = "Nguyen Van A";
        int experience = 0;
        String department = "Information System";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee insertedEmployee = repo.insert(employee);

        boolean testResult = (insertedEmployee == null ? false : insertedEmployee.equals(employee));
        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC14() {
        String id = "FPT1720";
        String name = "Nguyen Van A";
        int experience = 30;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee insertedEmployee = repo.insert(employee);

        boolean testResult = (insertedEmployee == null ? false : insertedEmployee.equals(employee));
        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC15() {
        String id = "FPT1720";
        String name = "Nguyen Van A";
        int experience = 15;
        String department = "IOT";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee insertedEmployee = repo.insert(employee);

        boolean testResult = (insertedEmployee == null ? false : insertedEmployee.equals(employee));
        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }


}