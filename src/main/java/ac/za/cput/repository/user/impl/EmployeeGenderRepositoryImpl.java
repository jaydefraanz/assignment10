package ac.za.cput.repository.user.impl;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.repository.user.EmployeeGenderRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderRepositoryImpl implements EmployeeGenderRepository {

    private static EmployeeGenderRepositoryImpl repository = null;
    private Set<EmployeeGender> employeeGenders;

    private EmployeeGenderRepositoryImpl()
    {
        employeeGenders = new HashSet<EmployeeGender>();
    }

    public static EmployeeGenderRepositoryImpl getEmployeeGenderRepository()
    {
        if(repository == null)
        {
            return new EmployeeGenderRepositoryImpl();
        }

        return repository;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return employeeGenders;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        employeeGenders.add(employeeGender);
        return employeeGender;
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {

        EmployeeGender readEmp = repository.read(employeeGender.getEmployeeNumber());

        if(readEmp != null)
        {
            this.employeeGenders.remove(readEmp);
            this.employeeGenders.add(employeeGender);
        }

        return null;
    }

    @Override
    public void delete(String s) {
        EmployeeGender deleteEmp = read(s);

        if(deleteEmp != null)
        {
            employeeGenders.remove(deleteEmp);
        }
    }

    @Override
    public EmployeeGender read(String s) {

        return this.employeeGenders.stream().filter(e -> e.getEmployeeNumber().equals(s)).findAny()
                .orElse(null);
    }
}
