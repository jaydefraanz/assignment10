package ac.za.cput.domain.user;

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
    }
}
