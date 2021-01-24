package com.example.SampleOne.Service;

import com.example.SampleOne.Dao.StudentDaoInterface;
import com.example.SampleOne.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("MangoData")
    private StudentDaoInterface studentDaoInterface;

    public Collection<Student> getAllStudents(){
        return studentDaoInterface.getAllStudents();
    }

    public Student getStudentById(int id){
        return this.studentDaoInterface.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDaoInterface.removeStudentByID(id);
    }

    public void updateStudent(Student student){
        this.studentDaoInterface.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDaoInterface.insertStudentToDb(student);
    }
}
