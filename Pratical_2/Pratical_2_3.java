
import java.util.Arrays;

public class Pratical_2_3 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 1, 2, 5, 6, 3, 7, 8, 9, 1};
        int[] newArray = eliminateDuplicates(inputArray);

        System.out.println("Original array: " + Arrays.toString(inputArray));
        System.out.println("Array after eliminating duplicates: " + Arrays.toString(newArray));
    }

    public static int[] eliminateDuplicates(int[] arr) {
        Arrays.sort(arr);

        int uniqueCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }
        int[] newArray = new int[uniqueCount];
        newArray[0] = arr[0];
        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                newArray[index] = arr[i];
                index++;
            }
        }

        return newArray;

    }
}
