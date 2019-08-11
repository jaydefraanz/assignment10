package ac.za.cput.repository.user.impl;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.repository.user.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Set<Employee> employees;

    private EmployeeRepositoryImpl()
    {
        this.employees = new HashSet<>();
    }

    public static EmployeeRepositoryImpl getRepository()
    {
        if(repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Employee> getAll() {
        return employees;
    }

    @Override
    public Employee create(Employee employee) {
        this.employees.add(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {

        Employee readEmp = repository.read(employee.getEmpNumber());

        if(readEmp != null)
        {
            this.employees.remove(employee.getEmpNumber());
            this.employees.add(employee);
        }

        return readEmp;
    }

    @Override
    public void delete(String s) {
        Employee deleteEmp = read(s);
        if(deleteEmp != null)
        {
            this.employees.remove(s);
        }

    }

    @Override
    public Employee read(String s) {
        return this.employees.stream().filter(e -> e.getEmpNumber().equals(s)).findAny()
                .orElse(null);
    }
}
