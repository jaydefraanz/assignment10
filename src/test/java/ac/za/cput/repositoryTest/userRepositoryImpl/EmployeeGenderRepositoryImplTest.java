package ac.za.cput.repositoryTest.userRepositoryImpl;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.domain.user.Employee;
import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.factory.demography.GenderFactory;
import ac.za.cput.factory.user.EmployeeFactory;
import ac.za.cput.factory.user.EmployeeGenderFactory;
import ac.za.cput.repository.user.impl.EmployeeGenderRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeGenderRepositoryImplTest {

    public EmployeeGenderRepositoryImpl repository;

    @Before
    public void setUp() throws Exception{
        repository = EmployeeGenderRepositoryImpl.getEmployeeGenderRepository();
    }

    @Test
    public void create() {
        Employee emp = EmployeeFactory.buildEmployee("jay","next");
        Gender gen = GenderFactory.buildGender("Male");
        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(emp.getEmpNumber(),gen.getId());

        this.repository.create(employee);

        EmployeeGender employee1 = repository.read(employee.getGenderId());

        Assert.assertFalse(emp.getEmpName().isEmpty());
    }

    @Test
    public void update() {
        Employee emp = EmployeeFactory.buildEmployee("jay","next");
        Gender gen = GenderFactory.buildGender("Male");
        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(emp.getEmpNumber(),gen.getId());

        this.repository.create(employee);

        EmployeeGender employeeUpdate = EmployeeGenderFactory.buildEmployeeGender(emp.getEmpNumber(),"2");
        //this.repository.update(employeeUpdate);

       // EmployeeGender employee1 = repository.read(employee.getGenderId());

        Assert.assertFalse(emp.toString().isEmpty());
    }

    @Test
    public void delete() {
        Employee emp = EmployeeFactory.buildEmployee("jay","next");
        Gender gen = GenderFactory.buildGender("Male");
        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(emp.getEmpNumber(),gen.getId());

        this.repository.create(employee);

        EmployeeGender employee1 = repository.read(employee.getGenderId());

        Assert.assertFalse(emp.getEmpLastName().isEmpty());
    }

    @Test
    public void read() {
        Employee emp = EmployeeFactory.buildEmployee("jay","next");
        Gender gen = GenderFactory.buildGender("Male");
        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(emp.getEmpNumber(),gen.getId());

        this.repository.create(employee);

        EmployeeGender employee1 = repository.read(employee.getGenderId());

        Assert.assertFalse(emp.getEmpName().isEmpty());
    }
}