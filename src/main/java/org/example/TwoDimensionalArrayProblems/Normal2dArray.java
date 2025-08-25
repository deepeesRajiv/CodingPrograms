package org.example.TwoDimensionalArrayProblems;

import org.example.ArrayPrograms.ReverseAnArray;

import java.util.Scanner;

public class Normal2dArray {


    public static void main(String[] args) {
        Normal2dArray sum = new Normal2dArray();
        sum.returnum();

    }

    public void returnum() {
       // Scanner sc = new Scanner(System.in);

        int[][] a2darr = {
                {1,2,3,4},
                {5,6,7,8},
                {8,9,1,2},
                {9,8,7,6}
        };

        for(int i=0;i<a2darr.length;i++){
            for (int j=0;j<a2darr[i].length;j++){
                System.out.print(a2darr[i][j]);
            }
            System.out.println();
        }

        System.out.println(
        "print the array column wise");
        for(int i=0;i<a2darr.length;i++){
            for (int j=0;j<a2darr[i].length;j++){
                System.out.print(a2darr[j][i]);
            }
            System.out.println();
        }

    }
}
