package com.company;

import java.util.Scanner;

public class SalesData {

    double[] sales;

    public SalesData(double[] sales) {
        this.sales = sales;
    }
    /*public SalesData(double[] sales) {
        this.sales=new  double[sales.length];
        for(int i =0; i<sales.length; i++)
           this.sales[i]= sales[i];
    }*/

    public  double getTotal()
    {
        double total = 0.0;
        for(int i =0; i<sales.length; i++)
            total += sales[i];
        return total;
    }

    public  double getAverage()
    {
       return getTotal()/sales.length;
    }

    public double getHighest()
    {
        double highest = sales[0];
        for(int i =0; i<sales.length; i++)
        {
            if (highest > sales[i])
                sales[i] = highest;
        }
        return highest;

    }
    public double getLowest()
    {
        double lowest = sales[0];
        for(int i =0; i<sales.length; i++)
        {
            if (lowest< sales[i])
                sales[i]= lowest;
        }
        return lowest;
    }


}
