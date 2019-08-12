package ac.za.cput.domainTest.user;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.factory.user.EmployeeFactory;
import ac.za.cput.factory.user.EmployeeGenderFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderTest {

    EmployeeGender empGen = EmployeeGenderFactory.buildEmployeeGender("Jay","Something");

    @Test
    public void getEmployeeNumber() {
        Assert.assertNotNull(empGen.getEmployeeNumber());
    }

    @Test
    public void getGenderId() {
        Assert.assertNotNull(empGen.getGenderId());
    }
}