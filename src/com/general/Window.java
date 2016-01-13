package com.general;

import com.dbs.Config;

import javax.swing.*;
import java.awt.*;

public class Window
{
    public Window(Simulation sim)
    {
        JFrame jFrame = new JFrame(Config.title);

        jFrame.setSize(new Dimension(
                Config.width,
                Config.height)
        );

        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(sim);
        jFrame.setVisible(true);
    }
}
