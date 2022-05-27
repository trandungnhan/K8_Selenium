//Get input from user about height(m) and weight(kg) then calculate BMI
//Underweight = <18.5
//Normal weight = 18.5 – 24.9
//Overweight = 25–29.9
//Obesity = BMI of 30 or greater
//BMI = weight / (height x 2)
//Suggest user to increase/decrease weight
package lab_02;

import java.util.Scanner;

public class BMICalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input weight: ");
        float weight = scanner.nextFloat();

        System.out.println("Please input height: ");
        float height = scanner.nextFloat();

        float bmi = weight / (height*2);
        System.out.printf("BMI is %f", bmi);

        if(bmi < 18.5){
            System.out.println("\nUnderweight");
            System.out.printf("Need to increase weight %f (Kg)", (18.5-bmi)*(height*2));
        }else if(bmi >= 18.5 && bmi <= 24.9){ // 50 1.70
            System.out.println("\nNormal weight"); // 70 1.7
        }else if(bmi >= 25 && bmi <= 30){
            System.out.println("\nOverweight"); // 80 1.6
            System.out.printf("Need to decrease weight %f (Kg)", (bmi-24.9)*(height*2));
        }else {
            System.out.println("\nObesity"); // 100 1.6
            System.out.printf("Need to decrease weight %f (Kg)", (bmi-24.9)*(height*2));
        }
    }
}