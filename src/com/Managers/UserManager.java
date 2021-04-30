package com.Managers;

import com.IEntityRepository;
import com.Logs.BaseLogger;
import com.People.Student;
import com.People.User;

import java.util.ArrayList;

public class UserManager extends BaseManager implements IEntityRepository<User> {


    @Override
    public void add(User user, BaseLogger logger) {

       add(user,logger);
    }

    @Override
    public void delete(User user, BaseLogger logger) {

      delete(user,logger);
    }

    @Override
    public void update(User user, BaseLogger logger) {

       update(user,logger);
    }

    @Override
    public ArrayList<User> getAll(User user, BaseLogger logger) {

       return getAll(user,logger);
    }

    @Override
    public void addMultiple(User[] t, BaseLogger logger) {

        addMultiple(t,logger);

    }

    @Override
    public void deleteMultiple(User[] t, BaseLogger logger) {

       deleteMultiple(t, logger);
    }

    @Override
    public void updateMultiple(User[] t, BaseLogger logger) {

       updateMultiple(t,logger);
    }
}
