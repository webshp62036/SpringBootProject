package com.example.crudeoperation.service;

import com.example.crudeoperation.crudoperation.CrudOpearationsMethods;
import com.example.crudeoperation.entity.DeptEntity;
import com.example.crudeoperation.repository.DeptRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService implements CrudOpearationsMethods {
    private final DeptRepository repo;

    public DeptService(DeptRepository repo) {

        this.repo = repo;
    }

    @Override
    public DeptEntity saveDeptInfo(DeptEntity Department) {
        return repo.save(Department);
    }

    @Override
    public DeptEntity updateDeptInfo(DeptEntity Department) {

        return repo.save(Department);
    }

    @Override
    public List<DeptEntity> findAllDeptInfo() {
        return (List<DeptEntity>) repo.findAll();
    }

    @Override
    public void deleteDeptInfo(Integer Id) {

        repo.deleteById(Id);
    }
}
