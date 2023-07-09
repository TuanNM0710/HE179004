/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package StudentRepository;

import DBContext.EmployeeDBContext;
import entity.Employee;

import java.util.List;

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
public class Search {

    public Search() {
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
        String name = "A";

        IEmployeeRepository repo = new EmployeeRepository();
        List<Employee> searchedEmployees = repo.search(name);
        List<Employee> employees = EmployeeDBContext.getInstance().employees;
        boolean testResult = true;

        for (Employee s : employees) {
            if (searchedEmployees.contains(s)) {
                if (!s.getEmployeeName().toLowerCase().contains(name.toLowerCase())) {
                    testResult = false;
                }
            } else {
                if (s.getEmployeeName().toLowerCase().contains(name.toLowerCase())) {
                    testResult = false;
                }
            }
        }

        EmployeeDBContext.getInstance().close();
        assertEquals(testResult, true);
    }

    @Test
    public void TC02() {
        String name = "B";

        IEmployeeRepository repo = new EmployeeRepository();
        List<Employee> searchedEmployees = repo.search(name);
        List<Employee> employees = EmployeeDBContext.getInstance().employees;
        boolean testResult = true;
        System.out.println(searchedEmployees);
        for (Employee s : employees) {
            if (searchedEmployees.contains(s)) {
                if (!s.getEmployeeName().toLowerCase().contains(name.toLowerCase())) {
                    testResult = false;
                }
            } else {
                if (s.getEmployeeName().toLowerCase().contains(name.toLowerCase())) {
                    testResult = false;
                }
            }
        }

        EmployeeDBContext.getInstance().close();
        assertEquals(testResult, true);
    }

    @Test
    public void TC03() {
        String name = "D";

        IEmployeeRepository repo = new EmployeeRepository();
        List<Employee> searchedEmployees = repo.search(name);
        List<Employee> employees = EmployeeDBContext.getInstance().employees;
        boolean testResult = true;
        for (Employee s : employees) {
            if (searchedEmployees.contains(s)) {
                if (!s.getEmployeeName().toLowerCase().contains(name.toLowerCase())) {
                    testResult = false;
                }
            } else {
                if (s.getEmployeeName().toLowerCase().contains(name.toLowerCase())) {
                    testResult = false;
                }
            }
        }

        EmployeeDBContext.getInstance().close();
        assertEquals(testResult, true);
    }

    @Test
    public void TC04() {
        String name = "10";

        IEmployeeRepository repo = new EmployeeRepository();
        List<Employee> searchedEmployees = repo.search(name);
        List<Employee> employees = EmployeeDBContext.getInstance().employees;
        boolean testResult = true;
        for (Employee s : employees) {
            if (searchedEmployees.contains(s)) {
                if (!s.getEmployeeName().toLowerCase().contains(name.toLowerCase())) {
                    testResult = false;
                }
            } else {
                if (s.getEmployeeName().toLowerCase().contains(name.toLowerCase())) {
                    testResult = false;
                }
            }
        }

        EmployeeDBContext.getInstance().close();
        assertEquals(testResult, true);
    }

}
