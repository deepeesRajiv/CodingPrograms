package org.example.TwoDimensionalArrayProblems;

public class SumOfPrimaryDiagonalElements {

    public static void main(String[] args) {
        SumOfPrimaryDiagonalElements sum = new SumOfPrimaryDiagonalElements();
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

        int sum = 0;
        for (int i = 0; i < a2darr.length; i++) {
            for (int j = 0; j < a2darr[i].length; j++) {
                if(a2darr[i]==a2darr[j]){
                    sum+=a2darr[i][j];
                }

            }

        }
        System.out.println("The sum of diagonal elemtns are :"+ sum);
    }




}
