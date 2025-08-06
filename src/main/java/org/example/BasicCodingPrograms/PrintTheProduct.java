package org.example.BasicCodingPrograms;

import java.util.Scanner;

public class PrintTheProduct {

    public static void main(String[] args) {
        PrintTheProduct product=new PrintTheProduct();
        product.returnProduct();

    }

    public double returnProduct(){
        Scanner sc = new Scanner(System.in);
        double firstnumber=sc.nextDouble();
        double secondnumber=sc.nextDouble();

        double productNumber=firstnumber * secondnumber;
        System.out.println("the product of two number is :"+productNumber);
        return productNumber;
    }
}
