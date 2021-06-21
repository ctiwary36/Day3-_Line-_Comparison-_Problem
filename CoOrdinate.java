package com.linecomparision;

import java.util.Scanner;
import java.lang.Math;

public class CoOrdinate extends Main {
    double x1, y1,x2,y2,x3,y3,x4,y4;

    public void Comparision() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1");
        x1 = sc.nextDouble();
        System.out.println("Enter y1");
        y1 = sc.nextDouble();
        System.out.println("Enter x2");
        x2 = sc.nextDouble();
        System.out.println("Enter y2");
        y2 = sc.nextDouble();
        System.out.println("Enter x3");
        x3 = sc.nextDouble();
        System.out.println("Enter y3");
        y3 = sc.nextDouble();
        System.out.println("Enter x4");
        x4 = sc.nextDouble();
        System.out.println("Enter y4");
        y4 = sc.nextDouble();
        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        String str1 = Double.toString(length1);
        double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        String str2 = Double.toString(length2);


        System.out.println(str2.compareTo(str1));


    }
}