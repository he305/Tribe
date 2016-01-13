package com.personal;

import com.tools.ChanceOfDeathComputer;
import com.tools.PersonCreator;

import java.util.ArrayList;

public class Person
{
    private String name;
    private boolean sex; //0 - man, 1 - woman
    private int age;
    private Person[] parents = new Person[2];
    private ArrayList<Person> children = new ArrayList<>();
    private Person partner;
    private Profession profession;
    private int chanceOfDeath;

    public Person(int age, boolean sex, Person father, Person mother)
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

        computeChanceOfDeath();
    }

    private void computeChanceOfDeath()
    {
        if (age <= 5)
        {
            chanceOfDeath = 10;
        }
        else if (age >= 5 && age <=25)
        {
            chanceOfDeath = 2;
        }
        else
        {
            chanceOfDeath = ChanceOfDeathComputer.getChance(age - 17);
        }
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

    public int getChanceOfDeath()
    {
        return chanceOfDeath;
    }
}
