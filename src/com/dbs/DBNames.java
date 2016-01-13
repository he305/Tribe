package com.dbs;

import com.loaders.TextLoader;

import java.util.ArrayList;

public class DBNames
{
    private static ArrayList<String> manNames;
    private static ArrayList<String> womanNames;

    public static void load()
    {
        manNames = new ArrayList<>();
        womanNames = new ArrayList<>();

        manNames = TextLoader.readFile("db/manNames");
        womanNames = TextLoader.readFile("db/womanNames");
    }

    public static ArrayList<String> getManNames()
    {
        return manNames;
    }

    public static ArrayList<String> getWomanNames()
    {
        return womanNames;
    }
}
