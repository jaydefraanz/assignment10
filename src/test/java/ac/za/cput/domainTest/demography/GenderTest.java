package ac.za.cput.domainTest.demography;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.factory.demography.GenderFactory;
import org.junit.Assert;
import org.junit.Test;


public class GenderTest {

    Gender gen = GenderFactory.buildGender("male");

    @Test
    public void getId() {
        //gen.setDesc("male");
        Assert.assertFalse(gen.getId().isEmpty());
    }

    @Test
    public void getDesc() {
        Assert.assertFalse(gen.getDesc().isEmpty());
    }

    @Test
    public void setId() {
        Assert.assertFalse(gen.getId().isEmpty());
    }

    @Test
    public void setDesc() {
        Assert.assertFalse(gen.getDesc().isEmpty());
    }
}