package ac.za.cput.serviceTest.userServiceImpl;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.factory.user.EmployeeFactory;
import ac.za.cput.service.user.EmployeeService;
import ac.za.cput.service.user.impl.EmployeeServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeServiceImplTest {

    private EmployeeService service;

    @Before
    public void setUp()
    {
        this.service = EmployeeServiceImpl.getService();
    }

    @Test
    public void getAll() {
        Set<Employee> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);
    }

    @Test
    public void create() {
        Employee emp2 = EmployeeFactory.buildEmployee("Jay", "Fraanz");
        Employee employee = EmployeeFactory.buildEmployee("John","Johnson");

        service.create(employee);
        service.create(emp2);
        Employee readEmployee = service.read(employee.getEmpNumber());

        Assert.assertNotSame(emp2, readEmployee.getEmpName());
    }

    @Test
    public void update() {
        Employee employee = EmployeeFactory.buildEmployee("Jay","Something");

        service.create(employee);
        Employee readEmployee = service.read(employee.getEmpNumber());

        employee.setEmpName("Lion");
        service.update(employee);

        Assert.assertTrue(this.service.getAll().size()>0);
    }

    @Test
    public void delete() {
        Employee employee = EmployeeFactory.buildEmployee("Jay","Something");

        service.create(employee);
        Employee readEmployee = service.read(employee.getEmpNumber());
        Assert.assertTrue(this.service.getAll().size()>0);
        service.delete(employee.getEmpNumber());
        Assert.assertTrue(this.service.getAll().size()>0);
    }

    @Test
    public void read() {
        Employee employee = EmployeeFactory.buildEmployee("Jay","Something");

        service.create(employee);
        Employee readEmployee = service.read(employee.getEmpNumber());
        Assert.assertNotNull(readEmployee);
    }
}