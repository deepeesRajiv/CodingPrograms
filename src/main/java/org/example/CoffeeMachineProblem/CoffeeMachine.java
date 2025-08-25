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
                    selectedItems("Coffee");
                    break;
                case 2:
                    selectedItems("Tea");
                    break;
                case 3:
                    selectedItems("Milk");
                    break;
                case 4:
                    selectedItems("Hot Water");
                    break;
                case 5:
                    selectedItems("Lemon Tea");
                    break;
                case 6:
                    System.out.println("Thank you for using this Machine, Good Bye");
                    break;
            }
        }else{

            System.out.println("Invalid Choice. Please select valid option from list.");
            displayItems();
            userselecteddata();

        }


    }

    public static void selectedItems(String itemSelected){
        System.out.println("You selected <"+itemSelected+"> from the list");
        System.out.println("Your <"+itemSelected+"> is Ready");


    }
}
