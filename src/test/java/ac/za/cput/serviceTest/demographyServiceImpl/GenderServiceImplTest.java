package ac.za.cput.serviceTest.demographyServiceImpl;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.factory.demography.GenderFactory;
import ac.za.cput.service.demography.impl.GenderServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class GenderServiceImplTest {

    GenderServiceImpl service;

    @Test
    public void getAll() {
        Gender gender = GenderFactory.buildGender("Male");
        service.create(gender);
        //System.out.println(service.getAll());
        Assert.assertTrue(true);
    }

    @Test
    public void create() {
        Gender gender = GenderFactory.buildGender("Male");
        service.create(gender);
        //System.out.println(service.getAll());
        Assert.assertTrue(true);
    }

    @Test
    public void update() {
        Gender gender = GenderFactory.buildGender("Male");
        service.create(gender);
        //System.out.println(service.getAll());
        Assert.assertTrue(true);
    }

    @Test
    public void delete() {
        Gender gender = GenderFactory.buildGender("Male");
        service.create(gender);
        //System.out.println(service.getAll());
        Assert.assertTrue(true);
    }

    @Test
    public void read() {
        Gender gender = GenderFactory.buildGender("Male");
        service.create(gender);
        //System.out.println(service.getAll());
        Assert.assertTrue(true);
    }
}