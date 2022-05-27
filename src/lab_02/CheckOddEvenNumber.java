package lab_02;

import java.util.Scanner;

public class CheckOddEvenNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number: ");
        int number = scanner.nextInt();

        if (number % 2 ==0){
            System.out.printf("%d is even number", number);
        }else {
            System.out.printf("%d is odd number", number);
        }
    }
}
