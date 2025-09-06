package org.example.TwoDimensionalArrayProblems;

public class PrimaryDiagonalElements {


    public static void main(String[] args) {
        PrimaryDiagonalElements sum = new PrimaryDiagonalElements();
        sum.returnum();

    }

    public void returnum() {
        // Scanner sc = new Scanner(System.in);

        int[][] a2darr = {
                {1, 2, 3, 4},
                {1, 22, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 33}
        };


        for (int i = 0; i < a2darr.length; i++) {
            for (int j = 0; j < a2darr[i].length; j++) {
                if(a2darr[i]==a2darr[j]){
                    System.out.println(a2darr[i][j]);
                }
//better way to solve this
            }
        }
    }





}
