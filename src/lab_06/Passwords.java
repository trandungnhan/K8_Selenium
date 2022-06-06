package lab_06;
/*
String myPassword = "password123";
Allow user to input maximum 3 times
 * */

import java.util.Scanner;

public class Passwords {

    public static void main(String[] args) {

        String myPassword = "password123";
        Scanner scanner = new Scanner(System.in);

        for (int time = 3; time > 0; time--) {
            System.out.print("Please input password: ");
            String enteredPassword = scanner.next();
            if(enteredPassword.equals(myPassword)){
                System.out.println("You are login successfully!!!");
                break;
            }else{
                System.out.printf("Your password is incorrect!!! You have %d time(s) to login\n",time-1);
            }
        }
    }
}

