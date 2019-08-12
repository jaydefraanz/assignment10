package ac.za.cput.repositoryTest.userRepositoryImpl;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.factory.user.EmployeeFactory;
import ac.za.cput.repository.user.impl.EmployeeRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeRepositoryImplTest {

    public EmployeeRepositoryImpl repository;

    @Before
    public void setUp() throws Exception{
        repository = EmployeeRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        Employee employee = EmployeeFactory.buildEmployee("Gavin","Next");

        this.repository.create(employee);

        Employee employee1 = repository.read(employee.getEmpNumber());

        Assert.assertSame(employee.getEmpNumber(),employee1.getEmpNumber());
    }

    @Test
    public void update() {
        Employee employee = EmployeeFactory.buildEmployee("Gavin","Stewards");
        this.repository.create(employee);

        Employee updateEmployee = EmployeeFactory.buildEmployee("Lord","Jayde");
        updateEmployee.setEmpNumber(employee.getEmpNumber());
        this.repository.update(updateEmployee);

        Assert.assertNotEquals(employee.getEmpName(),updateEmployee.getEmpName());
    }

    @Test
    public void delete() {
        Employee employee = EmployeeFactory.buildEmployee("Gavin","Stewards");
        this.repository.create(employee);
        Employee readEmp = repository.read(employee.getEmpNumber());

        this.repository.delete(readEmp.getEmpNumber());

        Assert.assertTrue(this.repository.getAll().size() > 0);
    }

    @Test
    public void read() {

        Employee employee = EmployeeFactory.buildEmployee("Gavin","Stewards");

        this.repository.create(employee);

        Employee employee1 = repository.read(employee.getEmpNumber());

        Assert.assertEquals(employee.getEmpNumber(),employee1.getEmpNumber());
    }
}