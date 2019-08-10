package ac.za.cput.factory.user;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.util.Misc;

public class EmployeeFactory {

    public static Employee buildEmployee(String fName, String lName)
    {
        return new Employee.Builder()
                .employeeNumber(Misc.generateId())
                .firstName(fName)
                .lastName(lName)
                .build();
    }
}
