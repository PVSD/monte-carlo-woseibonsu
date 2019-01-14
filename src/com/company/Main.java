package com.company;

public class Main {

    public static void main(String[] args) {

        MonteCarlo mc = new MonteCarlo(5, 3, 2);
        int circleCount = 0;
        int sqrCount = 0;

        for (int i = 0; i < 100000; i++)
        {
            if (mc.insideCircle(mc.nextRainDrop_x(), mc.nextRainDrop_y()))
            {
                circleCount++;
            }
            sqrCount++;
        }
        System.out.println(circleCount * (Math.pow(mc.h * 2, 2)) / (sqrCount * Math.pow(mc.r, 2)));

    }
}





