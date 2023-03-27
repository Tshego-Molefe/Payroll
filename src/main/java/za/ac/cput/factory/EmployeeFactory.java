package za.ac.cput.factory;

import za.ac.cput.domain.Employee;
import za.ac.cput.utility.Helper;

public class EmployeeFactory {
    public static Employee createEmployee(String firstName, String lastName, String email) {
        if (Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)) {
            return null;
        }
        String employeeNumber = Helper.generateId();

        //build employee object and return
        if (!Helper.isValidEmail(email)){
            return null;
        }
        Employee employee = new Employee.Builder().setFirstName(firstName)
                .setLastName(lastName)
                .setEmployeeNumber(employeeNumber)
                .setEmail(email)
                .build();

        return employee;
    }

}

