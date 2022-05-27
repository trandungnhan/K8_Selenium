package lab_03;

public class FindMaxAndMinValue {

    public static void main(String[] args) {

        int[] intArr = {6, 5, 1, 2, 7, 3, 4, 5};
        int maxValue = intArr[0];
        int minValue = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i]<minValue){
                minValue = intArr[i];
            }
            if (intArr[i] > maxValue){
                maxValue = intArr[i];
            }
        }
        System.out.printf("Min value is %d\n", minValue);
        System.out.printf("Max value is %d", maxValue);
    }
}