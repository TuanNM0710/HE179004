/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package EmployeeRepository;

import DBContext.EmployeeDBContext;
import entity.Employee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class Update {

    public Update() {
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
        String id = "FPT1234";
        String name = "Nguyen Van A";
        int experience = 6;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC02() {
        String id = "FPTe234";
        String name = "Nguyen Van A";
        int experience = 6;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC03() {
        String id = "FPT234";
        String name = "Nguyen Van A";
        int experience = 6;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC04() {
        String id = "fpt1234";
        String name = "Nguyen Van A";
        int experience = 6;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC05() {
        String id = "FPT1720";
        String name = "Nguyen Van A";
        int experience = 6;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC06() {
        String id = "FPT1234";
        String name = "Nguyen Van B";
        int experience = 6;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC07() {
        String id = "FPT1234";
        String name = "Nguyen Van A";
        int experience = 3;
        String department = "System Information ";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC08() {
        String id = "FPT1234";
        String name = "nguyen van a";
        int experience = 6;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC09() {
        String id = "FPT1234";
        String name = "Nguyen Van 10";
        int experience = 6;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC10() {
        String id = "FPT1234";
        String name = "Nguyen Van A";
        int experience = 0;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC11() {
        String id = "FPT1234";
        String name = "Nguyen Van A";
        int experience = 5;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC12() {
        String id = "FPT1234";
        String name = "Nguyen Van A";
        int experience = 9;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC13() {
        String id = "FPT1234";
        String name = "Nguyen Van A";
        int experience = Integer.MAX_VALUE;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC14() {
        String id = "FPT1234";
        String name = "Nguyen Van A";
        int experience = 6;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC15() {
        String id = "FPT1234";
        String name = "Nguyen Van A";
        int experience = 3;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC16() {
        String id = "FPT1234";
        String name = "Nguyen Van A";
        int experience = 6;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC17() {
        String id = "FPT1234";
        String name = "Nguyen Van A";
        int experience = 6;
        String department = "IS";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }



    @Test
    public void TC19() {
        String id = "FPT1234";
        String name = "Nguyen Van A ";
        int experience = 6;
        String department = "SE";
        Employee employee = new Employee(id, name, experience, department);

        IEmployeeRepository repo = new EmployeeRepository();
        Employee updatedEmployee = repo.update(employee);

        boolean testResult = (updatedEmployee == null ? false : updatedEmployee.equals(employee));

        EmployeeDBContext.getInstance().close();

        assertEquals(testResult, true);
    }



}
