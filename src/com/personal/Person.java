package com.personal;

import com.tools.PersonCreator;

import java.util.ArrayList;

public class Person
{
    private String name;
    private boolean sex; //0 - man, 1 - woman
    private byte age;
    private Person[] parents = new Person[2];
    private ArrayList<Person> children = new ArrayList<>();
    private Person partner;
    private Profession profession;
    private byte chanceOfDeath;

    public Person(byte age, boolean sex, Person father, Person mother)
    {
        this.age = age;
        this.sex = sex;
        init(father, mother);
        /////

        /////
    }


    public Person(boolean sex, Person father, Person mother)
    {
        this.sex = sex;
        init(father, mother);
        ////

        ////
    }

    private void init(Person father, Person mother)
    {
        parents[0] = father;
        parents[1] = mother;

        name = PersonCreator.createName(sex);
    }

    public String getName()
    {
        return name;
    }
}
