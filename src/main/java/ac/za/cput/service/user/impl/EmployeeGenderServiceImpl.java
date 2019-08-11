package ac.za.cput.service.user.impl;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.repository.user.EmployeeGenderRepository;
import ac.za.cput.repository.user.impl.EmployeeGenderRepositoryImpl;
import ac.za.cput.service.user.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {

    private EmployeeGenderServiceImpl service = null;
    private EmployeeGenderRepository repository;

    private EmployeeGenderServiceImpl()
    {
        repository = EmployeeGenderRepositoryImpl.getEmployeeGenderRepository();
    }

    public EmployeeGenderServiceImpl getService()
    {
        if (service == null) return new EmployeeGenderServiceImpl();
        return service;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return repository.getAll();
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return repository.create(employeeGender);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return this.repository.update(employeeGender);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public EmployeeGender read(String s) {
        return this.repository.read(s);
    }
}