package lab_03;

import java.util.Arrays;

public class Merge2SortedArrays {

    public static void main(String[] args) {

        int[] array01 = {1, 12, 16, 28, 34};
        int[] array02 =  {1, 13, 16, 27, 99};
        int[] merge2SortedArrays =  new int[array01.length+ array02.length];

        int i = 0, j = 0, k =0 ;

        while (i < array01.length && j < array02.length){
            if(array01[i] < array02[j]){
                merge2SortedArrays[k] = array01[i];
                merge2SortedArrays[k+1] = array02[j];
                k++;
                i++;
            }else {
                merge2SortedArrays[k] = array02[j];
                merge2SortedArrays[k+1] = array01[i];
                k++;
                j++;
            }
        }
        System.out.println("Array after merged 2 sorted arrays: " + Arrays.toString(merge2SortedArrays));
    }
}