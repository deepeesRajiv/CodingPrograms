package org.example.TwoDimensionalArrayProblems;

public class Sum2dArray {

    public static void main(String[] args) {
        Sum2dArray sum = new Sum2dArray();
        sum.returnum();

    }

    public void returnum() {
        // Scanner sc = new Scanner(System.in);

        int[][] a2darr = {
                {1, 2, 3, 4},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };

        int sum =0;
        for(int i=0;i<a2darr.length;i++){
            for(int j=0;j<a2darr[i].length;j++){
                sum+=a2darr[i][j];
            }


        }
        System.out.println("The sum od all the elements in array using indexed for loop is:" +sum);

        int sumnew =0;
        for(int[] newarr : a2darr){
            for(int latestarr: newarr){
                sumnew+= latestarr;
            }


        }
        System.out.println("The sum using the foreachloop is :"+sumnew);

    }
}
