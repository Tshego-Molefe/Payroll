package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    public void test(){
        Employee employee= EmployeeFactory.createEmployee("Tshego", "Molefe",
                "216549875@mycput.ac.za");
        System.out.println(employee.toString());
        assertNotNull(employee);
    }

    @Test
    public void test_fail(){
        Employee employee = EmployeeFactory.createEmployee("", "Molefe", "");
        System.out.println(employee.toString());
        assertNotNull(employee);
    }

}