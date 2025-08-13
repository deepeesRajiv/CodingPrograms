package org.example.CoffeeMachineProblem;

import org.example.BasicCodingPrograms.AverageOfNums;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        CoffeeMachine sum = new CoffeeMachine();
        sum.displayItems();
        sum.userselecteddata();

    }

    public void displayItems()
    {
        System.out.println("List Of Available Items :\n1.Coffee\n2. Tea\n3. Milk\n4. Hot Water\n5. Lemon Tea\n6. Exit");

    }
    public void userselecteddata() {

        System.out.println("Select your choice from above list (1-6) :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=1 && num<=6) {
            switch (num) {
                case 1:
                    System.out.println("Your <Coffee> is Ready");
                    break;
                case 2:
                    System.out.println("Your <Tea> is Ready");
                    break;
                case 3:
                    System.out.println("Your <Milk> is Ready");
                    break;
                case 4:
                    System.out.println("Your <Hot Water> is Ready");
                    break;
                case 5:
                    System.out.println("Your <Lemon Tea> is Ready");
                    break;
                case 6:
                    System.out.println("Thank you for using this Machine, Good Bye");
                    break;
            }
        }else{
            displayItems();
            System.out.println("Invalid Choice. Please select valid option from list.");

        }


    }
}
