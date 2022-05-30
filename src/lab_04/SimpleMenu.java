package lab_04;
/*
Lab 4: Create a simple menu with 4 options:
Generate an ArrayList with random numbers(not fixed numbers) those are less than 1000
After that, have a menu (You can use while loop) to have below options
=====MENU======
1. Print all numbers
2. Print maximum value
3. Print minimum value
4. Search number

Explaination:
Option 01: We print all the numbers that we have in the array list
Option 02: We need to find out the maximum number from array list and print out that value
Option 03: We need to find out the minimum number from array list and print out that value
Option 04: We allow user to input a number to search, if that number is existing in arraylist, we print the number and its index.
Otherwise, print that number is not in the list

Suggestion:
If you can, create methods to support the logic!
*/

import java.security.SecureRandom;
import java.util.*;

public class SimpleMenu {

    public static void main(String[] args) {
        List<Integer> arrayList = createArrayList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=====MENU======\n" +
                "1. Print all numbers\n" +
                "2. Print maximum value\n" +
                "3. Print minimum value\n" +
                "4. Search number\n" +
                "5. Exit");

        boolean isContinue = true;
        while (isContinue) {
            System.out.print("\n Please select option: ");
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    printArrayList(arrayList);
                    break;
                case 2:
                    findMaxValue(arrayList);
                    break;
                case 3:
                    findMinValue(arrayList);
                    break;
                case 4:
                    searchNumber(arrayList);
                    break;
                case 5:
                    System.out.println("Exit!!!");
                    isContinue = false;
            }
        }
    }

    public static List<Integer> createArrayList() {
        List<Integer> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input array length: ");
        int arrayLength = scanner.nextInt();

        for (int i = 0; i < arrayLength; i++) {
            int randomNumber = new SecureRandom().nextInt(1000);
            myList.add(i, randomNumber);
        }
        return myList;
    }

    public static void findMaxValue(List<Integer> myList) {
        int maxValue = myList.get(0);
        for (int number : myList) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        System.out.println("Maximum value is " + maxValue);
    }

    public static void findMinValue(List<Integer> myList) {
        int minValue = myList.get(0);
        for (int number : myList) {
            if (number < minValue) {
                minValue = number;
            }
        }
        System.out.println("Minimum value is " + minValue);
    }

    public static void printArrayList(List<Integer> myList) {
        System.out.print("All numbers are ");
        for (int number : myList) {
             System.out.print(number + " ");
       }
    }

    public static void searchNumber(List<Integer> myList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input number for searching: ");
        int number  = scanner.nextInt();
        for (int i:myList){
            if (i==number){
                System.out.println(number + " is existed in array list");
            }else{
                System.out.println(number + " is not existed in array list");
            }
            break;
        }
    }
}

