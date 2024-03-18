
import java.util.Scanner;

public class Pratical_2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        String largestCommonPrefix = getLargestCommonPrefix(str1, str2);

        System.out.println("Largest common prefix: " + largestCommonPrefix);

        scanner.close();
    }

    public static String getLargestCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        int index = 0;

        while (index < minLength && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }

        return str1.substring(0, index);
    }

}
