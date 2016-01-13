package com.general;

import com.dbs.Config;

import javax.swing.*;
import java.awt.*;

public class Window
{
    public Window(Simulation sim)
    {
        JFrame jFrame = new JFrame(Config.properties.getProperty("title"));

        jFrame.setSize(new Dimension(
                Integer.parseInt(Config.properties.getProperty("width")),
                Integer.parseInt(Config.properties.getProperty("height"))
        ));
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(sim);
        jFrame.setVisible(true);
    }
}
