package ac.za.cput.domain;

import javafx.util.Builder;

public class Employee {

    private String employeeNumber, firstName, lastName;

    private Employee(){}

    public Employee(Builder builder)
    {

    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public class Builder{
        private String employeeNumber, firstName, lastName;

        public Builder employeeNumber(String employeeNumber)
        {
            this.employeeNumber = employeeNumber;
            return this;
        }

        //do for all the private variables including firstname lastname

        public Employee build(){
            return new Employee(this);
        }
    }
}
