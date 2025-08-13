package org.example.BasicCodingPrograms;

import java.util.Scanner;

public class HeightProblem {

    public static void main(String[] args) {
        HeightProblem sum = new HeightProblem();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        float height = sc.nextFloat();

        if(height<150){
            System.out.println("The person is dwarf");
        } else if (height>=150 && height<165) {
            System.out.println("The person is avearge");
        } else if (height>=165 && height<195) {
            System.out.println("the person is taller");
        }
        else {
            System.out.println("the person is abnormal");
        }


    }
}
