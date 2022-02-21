package com.example.crudeoperation.crudoperation;

import com.example.crudeoperation.entity.DeptEntity;

import java.util.List;


public interface CrudOpearationsMethods  {
    // crete department data
    DeptEntity saveDeptInfo(DeptEntity Department);

    //update department information
    DeptEntity updateDeptInfo(DeptEntity Department);

    // Display data
     List<DeptEntity> findAllDeptInfo();

    // Delete data
    void deleteDeptInfo(Integer Id);
}
