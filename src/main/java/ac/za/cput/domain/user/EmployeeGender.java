package ac.za.cput.domain.user;

import javafx.util.Builder;

public class EmployeeGender
{
    private String employeeNumber, genderId;

    private EmployeeGender(){}

    public EmployeeGender(Builder builder)
    {

    }

    public String getEmployeeNumber(){return employeeNumber;}

    public String getGenderId(){return genderId;}

    @Override
    public String toString() {
        return "EmployeeGender{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", genderId='" + genderId + '\'' +
                '}';
    }

    public class Builder{
        private String employeeNumber, genderId;

        public Builder employeeNumber(String employeeNumber)
        {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder genderId(String genderId)
        {
            this.genderId = genderId;
            return this;
        }

        public EmployeeGender build(){return new EmployeeGender(this);}
    }
}
