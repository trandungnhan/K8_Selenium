package lab_06;
/*
Given input string: "2hrs and 5 minutes"
Please calculate how many minutes in total
 */

import java.util.Arrays;

public class MinutesCalculation {

    public static void main(String[] args) {

        String  str = "2hrs and 5 minutes";
        String[] splitStr = str.split("and");

        System.out.println(Arrays.toString(splitStr));
        String hrs = splitStr[0].replaceAll("[^0-9]","");
        System.out.println(splitStr[0]);
        System.out.println(hrs);

        String minutes = splitStr[1].replaceAll("[^0-9]","");
        System.out.println(splitStr[1]);
        System.out.println(minutes);

        int totalMinutes = Integer.parseInt(hrs)*60 + Integer.parseInt(minutes);
        System.out.printf("Total minutes is %d",totalMinutes);
    }
}
