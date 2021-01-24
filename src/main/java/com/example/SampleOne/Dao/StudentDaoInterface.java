package com.example.SampleOne.Dao;

import com.example.SampleOne.Entity.Student;

import java.util.Collection;

public interface StudentDaoInterface {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentByID(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
