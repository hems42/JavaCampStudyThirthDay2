package com;

import com.Logs.BaseLogger;
import com.People.Person;
import com.sun.istack.internal.Nullable;

import java.util.ArrayList;

public interface IEntityRepository <T extends IEntity>{

    // singular methots
     void  add(T t, @Nullable BaseLogger logger);
     void  delete(T t, @Nullable BaseLogger logger);
     void  update(T t, @Nullable BaseLogger logger);
    ArrayList<T> getAll(T t, @Nullable BaseLogger logger);



    // multiple methods
    void addMultiple(T [] t,@Nullable BaseLogger logger);
    void deleteMultiple(T [] t,@Nullable BaseLogger logger);
    void updateMultiple(T [] t,@Nullable BaseLogger logger);
    }
