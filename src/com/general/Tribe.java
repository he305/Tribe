package com.general;

import com.personal.Person;

import java.util.ArrayList;
import java.util.Random;

public class Tribe
{
    private ArrayList<Person> tribe;

    public Tribe()
    {
        tribe = new ArrayList<>(100);
        for (int i = 0; i < 10; i++)
        {
            tribe.add(new Person(new Random().nextBoolean(), null, null));
            System.out.println(tribe.get(i).getName());
        }
    }
}
