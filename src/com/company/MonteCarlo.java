package com.company;

import java.util.Random;

public class MonteCarlo {
    public double h = 0, k = 0, r = 0;
    private Random rnmd = new Random();

    public MonteCarlo(double h, double k, double r)
    {
        this.h = h;
        this.k = k;
        this.r = r;
    }

    public double nextRainDrop_x()
    {
        return (h * 2) * rnmd.nextDouble();
    }

    public double nextRainDrop_y()
    {
        return (k * 2) * rnmd.nextDouble();
    }

    public boolean insideCircle(double x, double y)
    {
        if ( Math.pow(x - h, 2) + Math.pow(y - k, 2) <= Math.pow(r, 2) )
        {
            return true;
        }
        else
            {
                return false;
            }
    }
}
