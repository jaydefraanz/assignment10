package ac.za.cput.factoryTest.user;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.factory.user.EmployeeFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @Test
    public void buildEmployee() {
        Employee employee = EmployeeFactory.buildEmployee("Jay", "Something");
        String name = employee.getEmpName();
        Assert.assertEquals(employee.getEmpName(), name);
    }
}