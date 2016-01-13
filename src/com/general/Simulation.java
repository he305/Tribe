package com.general;

import com.dbs.DBLoader;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Simulation extends Canvas implements Runnable
{
    private Thread thread;
    private boolean isGameRunning = false;

    public Simulation()
    {
        init();
        new Window(this);
    }

    private void init()
    {
        DBLoader.load();
    }

    public void start()
    {
        thread = new Thread(this, "MainThread");
        if (!isGameRunning)
        {
            isGameRunning = true;
            thread.start();
        }
    }

    public void stop()
    {
        if (isGameRunning)
        {
            try
            {
                thread.join();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            isGameRunning = false;
        }
    }

    public void run()
    {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int updates = 0;
        int frames = 0;
        while(isGameRunning){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >= 1){
                update();
                updates++;
                delta--;
            }
            render();
            frames++;

            if(System.currentTimeMillis() - timer > 1000){
                timer += 1000;
                System.out.println("FPS: " + frames + " TICKS: " + updates);
                frames = 0;
                updates = 0;
            }
        }
    }

    public void update()
    {
    }

    public void render()
    {
        BufferStrategy bs = this.getBufferStrategy();

        if (bs == null)
        {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        g.dispose();
        bs.show();
    }
}
