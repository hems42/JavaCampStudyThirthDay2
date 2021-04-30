package com.Managers;

import com.IEntityRepository;
import com.Logs.BaseLogger;
import com.People.Instructor;
import com.People.Person;

import java.util.ArrayList;

public  class InstructorManager extends BaseManager implements IEntityRepository<Instructor> {


    @Override
    public void add(Instructor instructor, BaseLogger logger) {

        add(instructor,logger);
    }

    @Override
    public void delete(Instructor instructor, BaseLogger logger) {

        delete(instructor,logger);
    }

    @Override
    public void update(Instructor instructor, BaseLogger logger) {

        update(instructor,logger);
    }

    @Override
    public ArrayList<Instructor> getAll(Instructor instructor, BaseLogger logger) {

       return getAll(instructor,logger);
    }

    @Override
    public void addMultiple(Instructor[] t, BaseLogger logger) {

        addMultiple(t,logger);
    }

    @Override
    public void deleteMultiple(Instructor[] t, BaseLogger logger) {

        deleteMultiple(t,logger);
    }

    @Override
    public void updateMultiple(Instructor[] t, BaseLogger logger) {

        updateMultiple(t,logger);
    }
}
