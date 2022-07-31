package com.kuang.dao;

import com.kuang.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    public List<Student> getStudents();
    public List<Student> getStudents2();
}
