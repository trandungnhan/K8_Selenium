package lab_03;

public class CountOddEvenNumbers {

    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int evenNumber = 0;
        int oddNumber = 0;

        for (int number : intArr) {
            if (number % 2 == 0){
                evenNumber++;
            }
            else {
                oddNumber++;
            }
        }
        System.out.printf("Total even numbers are %d\n", evenNumber);
        System.out.printf("Total odd numbers are %d", oddNumber);
    }
}