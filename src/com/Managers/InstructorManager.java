package com.Managers;

import com.IEntityRepository;
import com.Logs.BaseLogger;
import com.People.Instructor;
import com.People.Person;

import java.util.ArrayList;

public  class InstructorManager extends BaseManager implements IEntityRepository<Instructor> {


    @Override
    public void add(Instructor instructor, BaseLogger logger) {

        super.add(instructor,logger);
    }

    @Override
    public void delete(Instructor instructor, BaseLogger logger) {

        super.delete(instructor,logger);
    }

    @Override
    public void update(Instructor instructor, BaseLogger logger) {

        super.update(instructor,logger);
    }

    @Override
    public ArrayList<Instructor> getAll( BaseLogger logger) {

       return super.getAll(new Instructor(),logger);
    }

    @Override
    public void addMultiple(Instructor[] t, BaseLogger logger) {

        super.addMultiple(t,logger);
    }

    @Override
    public void deleteMultiple(Instructor[] t, BaseLogger logger) {

        super.deleteMultiple(t,logger);
    }

    @Override
    public void updateMultiple(Instructor[] t, BaseLogger logger) {

        super.updateMultiple(t,logger);
    }
}
