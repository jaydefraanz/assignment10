package ac.za.cput.factoryTest.demography;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.factory.demography.GenderFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Test
    public void buildGender() {
        Gender gender = GenderFactory.buildGender("Male");
        String theGen = gender.getDesc();
        Assert.assertEquals(gender.getDesc(),theGen);
    }
}