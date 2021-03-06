package com.Managers;


import com.Logs.BaseLogger;
import com.People.Person;
import com.sun.istack.internal.Nullable;

import java.util.ArrayList;

public abstract class BaseManager {




    // all Of Those are base methods for repository...



    // singular methods
     void  add(Person person, @Nullable BaseLogger logger)
    {
        System.out.println(person.toString() + " Başarıyla eklendi");
        insideLog(logger);
    }

    void delete(Person person, @Nullable BaseLogger logger)
    {
        System.out.println(person.toString() + " Başarıyla silindi");
        insideLog(logger);
    }

    void update(Person person, @Nullable BaseLogger logger)
    {
        System.out.println(person.toString() + " Başarıyla güncellendi");
        insideLog(logger);
    }

    ArrayList getAll(Person person, @Nullable BaseLogger logger)
    {
        ArrayList people = new ArrayList();

        for(int i=0;i<5;i++)
        {

            people.add(person);

        }
        //........

        System.out.println("Tüm "+person.getDescreption() + " kayıtları başarıyla getirilmiştir,\ngetirilen kayıt sayısı :"+people.size());
        insideLog(logger);

        return people;
    }



    // multiple methods

    void addMultiple(Person [] people,@Nullable BaseLogger logger)
    {
        for(Person person:people)
        {
            add(person,logger);
        }

        System.out.println("Toplu iş dosyası başarıyla eklendi");
    }

    void deleteMultiple(Person [] people,@Nullable BaseLogger logger)
    {
        for(Person person:people)
        {
            delete(person,logger);
        }

        System.out.println("Toplu iş dosyası başarıyla silindi");
    }


    void updateMultiple(Person [] people,@Nullable BaseLogger logger)
    {
        for(Person person:people)
        {
            update(person,logger);
        }

        System.out.println("Toplu iş dosyası başarıyla güncellendi");
    }












    void insideLog(BaseLogger logger)
    {
        if(logger!=null)
        {
            logger.log();
        }
    }

}
