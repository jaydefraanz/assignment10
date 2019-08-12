package ac.za.cput.factoryTest.user;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.factory.user.EmployeeGenderFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest {

    @Test
    public void buildEmployeeGender() {
        EmployeeGender empGen = EmployeeGenderFactory.buildEmployeeGender("15","34");
        String empId = empGen.getGenderId();
        Assert.assertNotSame(empGen.getEmployeeNumber(),empId);
    }
}