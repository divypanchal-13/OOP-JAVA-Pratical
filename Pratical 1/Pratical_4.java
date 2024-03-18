import java.util.Scanner;

public class Pratical_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight in pounds : ");
        double weightP = sc.nextDouble();

        System.out.println("Enter height in inches : ");
        double heightI = sc.nextDouble();

        double weightKg = weightP * 0.45359237;
        double heightMeters = heightI * 0.0254;

        double BMI = weightKg / (heightMeters * heightMeters);

        // double BMI = (weightP*0.45359237) / ((heightI*0.0254) * (heightI*0.0254) );

        System.out.println( "Body Mass Index :" + BMI );
        sc.close();

    }
}


