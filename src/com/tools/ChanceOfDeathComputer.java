package com.tools;

public class ChanceOfDeathComputer
{
    public static int getChance(int num)
    {
        int ans = 0;
        for (int i = 1; i <= num; i++)
        {
            ans += i;
        }
        return ans;
    }
}
