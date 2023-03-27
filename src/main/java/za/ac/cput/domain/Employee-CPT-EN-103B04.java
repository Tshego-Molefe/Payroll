package za.ac.cput.domain;

import java.util.Objects;

public class Employee {
    private String firstName, lastName, employeeNumber, email;

    private Employee(){
    }
    /*public Employee(String lastName){
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, String employeeNumber){
        this.firstName = firstName;
        this.lastName = lastName;
    }*/

    //Add private constructor here
    private Employee(Builder builder){
        this.firstName= builder.firstName;
        this.lastName = builder.lastName;
        this.employeeNumber = builder.employeeNumber;
        this.email = builder.email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName)
                && Objects.equals(lastName, employee.lastName) ;
                //&& Objects.equals(employeeNumber, employee.employeeNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, employeeNumber, email);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


//implement builder pattern
    public static class Builder{
    private String firstName, lastName, employeeNumber, email;

    public Builder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Builder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Builder setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
        return this;
    }

    public Builder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Builder copy(Employee employee){
        this.firstName = employee.firstName;
        this.lastName = employee.lastName;
        this.employeeNumber = employee.employeeNumber;
        this.email = employee.email;
        return this;
    }

    public Employee build(){
        return new Employee(this);
    }
}

}
