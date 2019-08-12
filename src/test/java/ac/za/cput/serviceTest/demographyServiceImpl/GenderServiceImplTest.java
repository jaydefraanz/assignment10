package ac.za.cput.serviceTest.demographyServiceImpl;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.factory.demography.GenderFactory;
import ac.za.cput.service.demography.impl.GenderServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenderServiceImplTest {

    GenderServiceImpl service;
    @Before
    public void setUp()throws Exception{
        service = GenderServiceImpl.getService();
    }

    @Test
    public void getAll() {
        Gender gender = GenderFactory.buildGender("Male");
        service.create(gender);
        //System.out.println(service.getAll());
        Assert.assertFalse(gender.getId().isEmpty());
    }

    @Test
    public void create() {
        Gender gender = GenderFactory.buildGender("Male");
        service.create(gender);
        Gender readGen = service.read(gender.getId());
        Assert.assertFalse(gender.getDesc().isEmpty());
    }

    @Test
    public void update() {
        Gender gender = GenderFactory.buildGender("Male");
        service.create(gender);
        Gender gen2 = GenderFactory.buildGender("female");
        gender.setDesc(gen2.getDesc());
        service.update(gender);
        Assert.assertSame(gender.getDesc(),gen2.getDesc());
    }

    @Test
    public void delete() {
        Gender gender = GenderFactory.buildGender("Male");
        service.create(gender);
        service.delete(gender.getId());
        Assert.assertTrue(this.service.getAll().size() >0);
    }

    @Test
    public void read() {
        Gender gender = GenderFactory.buildGender("Male");
        service.create(gender);
        //System.out.println(service.getAll());
        Gender readGen = service.read(gender.getId());
        Assert.assertFalse(readGen.getDesc().isEmpty());
    }
}