package ac.za.cput.domain.user;

import java.util.Objects;

public class Employee {

    private String empNumber, empName, empLastName;

    private Employee(){}

    public Employee(Builder builder)
    {
        this.empNumber = builder.employeeNumber;
        this.empName = builder.firstName;
        this.empLastName = builder.lastName;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber='" + empNumber + '\'' +
                ", empName='" + empName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                '}';
    }

    public static class Builder{
        private String employeeNumber, firstName, lastName;

        public Builder employeeNumber(String employeeNumber)
        {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder firstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }

        public Employee copy(Employee employee)
        {
            this.employeeNumber = employee.empNumber;
            this.firstName = employee.empName;
            this.lastName = employee.empLastName;
            return employee;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empNumber, employee.empNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNumber);
    }
}
