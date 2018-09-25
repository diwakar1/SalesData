package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by diwakarsharma on 9/25/18.
 */
public class Sales {
    public static void main(String[] args) {

        final int ONE_WEEK=7;
        double[]sales= new double[ONE_WEEK];
        DecimalFormat d = new DecimalFormat("#,##0.00");
        SalesData week;
        getValues(sales);
        week= new SalesData(sales);

        System.out.println();
        System.out.println("The total sales were $ "+ d.format(week.getTotal()));
        System.out.println("The average sales were $ "+ d.format(week.getAverage()));
        System.out.println("The highest sales were $ "+ d.format(week.getHighest()));
        System.out.println("The Lowest sales were $ "+ d.format(week.getLowest()));



    }
    private static void getValues(double[] array)
    {
        System.out.println("Enter the sales for each of the following days.");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<array.length;i++)
        {
            System.out.println("DAY "+ (i+1) + " : ");
            array[i]= input.nextDouble();
        }
    }

}
