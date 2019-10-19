package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class StudentDataSourceRepo {

    private static StudentDataSourceRepo instance =null;
    private List<Student>studentList=new ArrayList<>();


    public StudentDataSourceRepo() {
        Student object =new Student();
        object.id=1;
        object.name="Ruby";
        object.password="abc";
        studentList.add(object);
    }

    public static StudentDataSourceRepo getInstance(){
        if(instance==null){
            instance=new StudentDataSourceRepo();
        }
        return instance;
    }

    public void addstudent(Student student)
    {
        studentList.add(student);
    }

    public List<Student> getstudent()
    {
        return studentList;
    }
}
