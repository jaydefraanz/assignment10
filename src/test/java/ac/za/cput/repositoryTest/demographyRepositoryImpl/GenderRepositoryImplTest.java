package ac.za.cput.repositoryTest.demographyRepositoryImpl;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.factory.demography.GenderFactory;
import ac.za.cput.repository.demography.impl.GenderRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenderRepositoryImplTest {

    public GenderRepositoryImpl repository;

    @Before
    public void setUp()throws Exception{
        repository = GenderRepositoryImpl.getRepository();
    }

    @Test
    public void getAll() {
        Gender gender = GenderFactory.buildGender("Male");

        this.repository.create(gender);

        Gender readValue = repository.read(gender.getId());
        Assert.assertSame(gender.getId(), readValue.getId());
    }

    @Test
    public void create() {
        Gender gender = GenderFactory.buildGender("Male");

        this.repository.create(gender);

        Gender readValue = repository.read(gender.getId());
        Assert.assertSame(gender.getId(), readValue.getId());
    }

    @Test
    public void update() {
        Gender gender = GenderFactory.buildGender("Male");

        this.repository.create(gender);

        Gender updateGender = GenderFactory.buildGender("Not specified");
        updateGender.setId(gender.getId());

        this.repository.update(updateGender);
        Assert.assertNotEquals(gender.getDesc(), updateGender.getDesc());
    }

    @Test
    public void delete() {
        Gender gender = GenderFactory.buildGender("Male");

        this.repository.create(gender);

        Gender readValue = repository.read(gender.getId());
        this.repository.delete(readValue.getId());

        Assert.assertTrue(this.repository.getAll().size()>0);
    }

    @Test
    public void read() {
        Gender gender = GenderFactory.buildGender("Male");

        this.repository.create(gender);

        Gender readValue = repository.read(gender.getId());
        Assert.assertSame(gender.getId(), readValue.getId());
    }
}