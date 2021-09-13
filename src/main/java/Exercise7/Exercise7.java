/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package Exercise7;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){

        Scanner data = new Scanner(System.in);

        System.out.print("PLease enter the length of the room in feet:");

        String STRlength = data.nextLine();

        System.out.print("Please enter the width of the room:");

        String STRwidth = data.nextLine();

        var length = Integer.parseInt(STRlength, 10);

        var width = Integer.parseInt(STRwidth, 10);

        int area = length * width;

        System.out.println("The area is");

        System.out.printf("%d square feet\n", area);

        double m_to_fconvert = 0.09290304;

        double m2 = area * m_to_fconvert;

        System.out.printf("%f square meters", m2);



    }

}
