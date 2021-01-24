package com.example.SampleOne.Dao;

import com.example.SampleOne.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeData")
public class StudentDao implements StudentDaoInterface {

    private  static Map<Integer, Student> students;

    static {

        students = new HashMap<Integer, Student>(){
            {
                put(1,new Student(1,"Husanboy","Computer Science"));
                put(2,new Student(2,"Jamshid","Finance"));
                put(3,new Student(3,"Zohidjon","Maths"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id){
        return this.students.get(id);
    }

    @Override
    public void removeStudentByID(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student){
        Student st = students.get(student.getId());
        st.setCourse(student.getCourse());
        st.setName(student.getName());
        students.put(student.getId(),student);
    }

    @Override
    public void insertStudentToDb(Student student) {
        this.students.put(student.getId(),student);
    }
}
