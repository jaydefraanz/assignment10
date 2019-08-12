package ac.za.cput.domainTest.user;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.factory.user.EmployeeFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    Employee emp = EmployeeFactory.buildEmployee("Jay","Something");


    @Test
    public void getEmpNumber() {
        Assert.assertNotNull(emp.getEmpNumber());
    }

    @Test
    public void getEmpName() {
        Assert.assertNotNull(emp.getEmpName());
    }

    @Test
    public void getEmpLastName() {
        Assert.assertNotNull(emp.getEmpLastName());
    }
}