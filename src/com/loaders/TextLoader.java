package com.loaders;

import java.io.*;
import java.util.ArrayList;

public class TextLoader
{
    public static ArrayList<String> readFile(String fileName)
    {
        ArrayList<String> strings = new ArrayList<>();

        try
        {
            InputStream is = TextLoader.class.getClassLoader().getResourceAsStream(fileName + ".txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String strLine;

            while ((strLine = br.readLine()) != null){
                strings.add(strLine);
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

        return strings;
    }
}
