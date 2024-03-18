import java.util.Scanner;

public class Pratical_3 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length in meters: ");
        double meters = sc.nextDouble();
        double feet = meters * 3.28084;

        System.out.println(meters + " meters = " + feet + " feet.");
        sc.close();
    }
}
