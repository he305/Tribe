package com.general;

import com.dbs.Config;
import com.personal.Person;

import java.awt.*;
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
            tribe.add(new Person(
                    new Random().nextInt(40),
                    new Random().nextBoolean(),
                    null,
                    null)
            );
            System.out.println(tribe.get(i).getName() + "  " + tribe.get(i).getAge() + "  " + tribe.get(i).getChanceOfDeath());
        }
    }

    public void update()
    {

    }

    public void render(Graphics g)
    {
        g.fillRect(0, 0, Config.width, Config.height);
    }
}
