import java.util.Scanner;
public class Pratical_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter(a-z) : ");
        char letter = sc.next().toLowerCase().charAt(0);

        if ( letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println( letter + " is a vowel.");
        } else {
            System.out.println( letter + " is a consonant.");
        }
        sc.close();
    }
}
