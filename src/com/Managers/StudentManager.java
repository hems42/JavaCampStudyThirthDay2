package com.Managers;

import com.IEntityRepository;
import com.Logs.BaseLogger;
import com.People.Instructor;
import com.People.Student;

import java.util.ArrayList;

public class StudentManager extends BaseManager implements IEntityRepository<Student> {

    @Override
    public void add(Student student, BaseLogger logger) {

        super.add(student,logger);
    }

    @Override
    public void delete(Student student, BaseLogger logger) {

        super.delete(student,logger);
    }

    @Override
    public void update(Student student, BaseLogger logger) {

        super.update(student,logger);
    }

    @Override
    public ArrayList<Student> getAll( BaseLogger logger) {

       return super.getAll(new Student(),logger);
    }

    @Override
    public void addMultiple(Student[] t, BaseLogger logger) {

        super.addMultiple(t,logger);

    }

    @Override
    public void deleteMultiple(Student[] t, BaseLogger logger) {

        super.deleteMultiple(t,logger);
    }

    @Override
    public void updateMultiple(Student[] t, BaseLogger logger) {

        super.updateMultiple(t,logger);
    }
}
