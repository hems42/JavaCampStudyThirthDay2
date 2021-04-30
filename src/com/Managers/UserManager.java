package com.Managers;

import com.IEntityRepository;
import com.Logs.BaseLogger;
import com.People.Person;
import com.People.Student;
import com.People.User;

import java.util.ArrayList;

public class UserManager extends BaseManager implements IEntityRepository<User> {


    @Override
    public void add(User user, BaseLogger logger) {

       super.add(user,logger);
    }

    @Override
    public void delete(User user, BaseLogger logger) {

      super.delete(user,logger);
    }

    @Override
    public void update(User user, BaseLogger logger) {

       super.update(user,logger);
    }

    @Override
    public ArrayList<User> getAll(BaseLogger logger) {


        return  super.getAll(new User(),logger);
    }

    @Override
    public void addMultiple(User[] t, BaseLogger logger) {

        super.addMultiple(t,logger);

    }

    @Override
    public void deleteMultiple(User[] t, BaseLogger logger) {

        super.deleteMultiple(t, logger);
    }

    @Override
    public void updateMultiple(User[] t, BaseLogger logger) {

        super.updateMultiple(t,logger);
    }
}
