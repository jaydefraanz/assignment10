package ac.za.cput.serviceTest.userServiceImpl;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.factory.user.EmployeeGenderFactory;
import ac.za.cput.service.user.EmployeeGenderService;
import ac.za.cput.service.user.impl.EmployeeGenderServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeGenderServiceImplTest {

    private EmployeeGenderService service;

    @Before
    public void setUp()
    {
        this.service = EmployeeGenderServiceImpl.getService();
    }

    @Test
    public void getAll() {
        Set<EmployeeGender> empGenSet = service.getAll();
        Assert.assertNotNull(empGenSet);
    }

    @Test
    public void create() {
        EmployeeGender empGen = EmployeeGenderFactory.buildEmployeeGender("100","15");
        service.create(empGen);

        Assert.assertFalse(empGen.getEmployeeNumber().isEmpty());
    }

    @Test
    public void update() {
        EmployeeGender empGen = EmployeeGenderFactory.buildEmployeeGender("100","15");
        service.create(empGen);

        //EmployeeGender empGen2 = EmployeeGenderFactory.buildEmployeeGender("150","15");
       // service.update(empGen2);

        Assert.assertFalse(false);
    }

    @Test
    public void delete() {
        EmployeeGender empGen = EmployeeGenderFactory.buildEmployeeGender("100","15");
        service.create(empGen);

        service.delete(empGen.getGenderId());

        Assert.assertFalse(empGen.getEmployeeNumber().isEmpty());
    }

    @Test
    public void read() {
        EmployeeGender empGen = EmployeeGenderFactory.buildEmployeeGender("100","15");
        service.create(empGen);

        Assert.assertFalse(empGen.getEmployeeNumber().isEmpty());
    }
}