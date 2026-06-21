package com.model.dao;

import java.util.List;

public interface StudentDao{
       void save(Student student);
       List<Student> findAll();
       void delete(int id);
       void update(Student student);
}
