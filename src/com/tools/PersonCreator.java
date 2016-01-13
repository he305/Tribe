package com.tools;

import com.dbs.DBNames;

import java.util.Random;

public class PersonCreator
{
    public static String createName(boolean sex)
    {
        String name;

        if (!sex)
        {
            name = DBNames.getManNames().get(new Random().nextInt(DBNames.getManNames().size()));
        }
        else
        {
            name = DBNames.getWomanNames().get(new Random().nextInt(DBNames.getManNames().size()));
        }

        return name;
    }
}
