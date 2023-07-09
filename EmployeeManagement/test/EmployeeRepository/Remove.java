/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package EmployeeRepository;

import DBContext.EmployeeDBContext;
import entity.Employee;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Asus
 */
public class Remove {

    public Remove() {
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
        String id = "FPT2468";

        IEmployeeRepository repo = new EmployeeRepository();
        Employee deletedEmployee = repo.remove(id);

        boolean testResult = !(deletedEmployee == null);
        if (deletedEmployee != null) {
            List<Employee> employees = EmployeeDBContext.getInstance().employees;

            for (Employee s : employees) {
                if (s.equals(deletedEmployee)) {
                    testResult = false;
                    break;
                }
            }
        }
        EmployeeDBContext.getInstance().close();
        assertEquals(testResult, true);

    }

    @Test
    public void TC02() {
        String id = "FPT234";

        IEmployeeRepository repo = new EmployeeRepository();
        Employee deletedEmployee = repo.remove(id);

        boolean testResult = !(deletedEmployee == null);

        if (deletedEmployee != null) {
            List<Employee> employees = EmployeeDBContext.getInstance().employees;

            for (Employee s : employees) {
                if (s.equals(deletedEmployee)) {
                    testResult = false;
                    break;
                }
            }
        }
        EmployeeDBContext.getInstance().close();
        assertEquals(testResult, false);

    }

    @Test
    public void TC03() {
        String id = "fpt2468";

        IEmployeeRepository repo = new EmployeeRepository();
        Employee deletedEmployee = repo.remove(id);

        boolean testResult = !(deletedEmployee == null);
        if (deletedEmployee != null) {
            List<Employee> employees = EmployeeDBContext.getInstance().employees;

            for (Employee s : employees) {
                if (s.equals(deletedEmployee)) {
                    testResult = false;
                    break;
                }
            }
        }
        EmployeeDBContext.getInstance().close();
        assertEquals(testResult, true);

    }

    @Test
    public void TC04() {
        String id = "HF2468";

        IEmployeeRepository repo = new EmployeeRepository();
        Employee deletedEmployee = repo.remove(id);

        boolean testResult = !(deletedEmployee == null);
        if (deletedEmployee != null) {
            List<Employee> employees = EmployeeDBContext.getInstance().employees;

            for (Employee s : employees) {
                if (s.equals(deletedEmployee)) {
                    testResult = false;
                    break;
                }
            }
        }
        EmployeeDBContext.getInstance().close();
        assertEquals(testResult, false);

    }

    @Test
    public void TC05() {
        String id = "HF24686";

        IEmployeeRepository repo = new EmployeeRepository();
        Employee deletedEmployee = repo.remove(id);

        boolean testResult = !(deletedEmployee == null);
        if (deletedEmployee != null) {
            List<Employee> employees = EmployeeDBContext.getInstance().employees;

            for (Employee s : employees) {
                if (s.equals(deletedEmployee)) {
                    testResult = false;
                    break;
                }
            }
        }
        EmployeeDBContext.getInstance().close();
        assertEquals(testResult, false);

    }

    @Test
    public void TC06() {
        String id = "FPT1720";

        IEmployeeRepository repo = new EmployeeRepository();
        Employee deletedEmployee = repo.remove(id);

        boolean testResult = !(deletedEmployee == null);
        if (deletedEmployee != null) {
            List<Employee> employees = EmployeeDBContext.getInstance().employees;

            for (Employee s : employees) {
                if (s.equals(deletedEmployee)) {
                    testResult = false;
                    break;
                }
            }
        }
        EmployeeDBContext.getInstance().close();
        assertEquals(testResult, false);

    }

    @Test
    public void TC07() {
        String id = "HEF720";

        IEmployeeRepository repo = new EmployeeRepository();
        Employee deletedEmployee = repo.remove(id);

        boolean testResult = !(deletedEmployee == null);
        if (deletedEmployee != null) {
            List<Employee> employees = EmployeeDBContext.getInstance().employees;

            for (Employee s : employees) {
                if (s.equals(deletedEmployee)) {
                    testResult = false;
                    break;
                }
            }
        }
        EmployeeDBContext.getInstance().close();
        assertEquals(testResult, false);

    }

}
