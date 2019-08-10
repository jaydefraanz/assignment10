package ac.za.cput.domain.user;

import javafx.util.Builder;

public class EmployeeGender
{
    private String employeeNumber, genderId;

    private EmployeeGender(){}


    public String getEmployeeNumber(){return employeeNumber;}

    public String getGenderId(){return genderId;}

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    public EmployeeGender empGender(String empNumber, String genderId)
    {
        this.employeeNumber = empNumber;
        this.genderId = genderId;
        return this;
    }

    @Override
    public String toString() {
        return "EmployeeGender{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", genderId='" + genderId + '\'' +
                '}';
    }

    //no need for builder class here.
}
