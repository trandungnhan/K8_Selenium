package lab_03;

import java.util.Arrays;

public class SortMinToMax {

    public static void main(String[] args) {

        int[] intArr = {12, 34, 1, 16, 28};
        System.out.println("Array before sorted " + Arrays.toString(intArr));

        int temp = intArr[0];
        for (int i =0; i < intArr.length - 1; i++) {
            for (int j = i+1; j < intArr.length; j++) {
                if(intArr[i] > intArr[j]){
                    temp = intArr[j];
                    intArr[j]= intArr[i];
                    intArr[i]= temp;
                }
            }
        }
        System.out.println("Array after sorted " + Arrays.toString(intArr));
    }
}