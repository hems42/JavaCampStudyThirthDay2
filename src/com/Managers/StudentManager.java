package com.Managers;

import com.IEntityRepository;
import com.Logs.BaseLogger;
import com.People.Instructor;
import com.People.Student;

import java.util.ArrayList;

public class StudentManager extends BaseManager implements IEntityRepository<Student> {

    @Override
    public void add(Student student, BaseLogger logger) {

        add(student,logger);
    }

    @Override
    public void delete(Student student, BaseLogger logger) {

        delete(student,logger);
    }

    @Override
    public void update(Student student, BaseLogger logger) {

        update(student,logger);
    }

    @Override
    public ArrayList<Student> getAll(Student student, BaseLogger logger) {

       return getAll(student,logger);
    }

    @Override
    public void addMultiple(Student[] t, BaseLogger logger) {

       addMultiple(t,logger);

    }

    @Override
    public void deleteMultiple(Student[] t, BaseLogger logger) {

        deleteMultiple(t,logger);
    }

    @Override
    public void updateMultiple(Student[] t, BaseLogger logger) {

        updateMultiple(t,logger);
    }
}
