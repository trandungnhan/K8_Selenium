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

        for (int time = 0; time < 3; time++) {
            System.out.print("Please input password: ");
            String enteredPassword = scanner.next();
            if(enteredPassword.equals(myPassword)){
                System.out.println("You are login successfully!!!");
                break;
            }else if (!enteredPassword.equals(myPassword) && time == 2){
                System.out.println("Your account is locked due to 3 failed");
            }else{
                System.out.println("Your password is incorrect, please try again!!!");
            }
        }
    }
}

