/*
Write a Java application which takes several command line arguments, which are supposed to be names of students and prints output as given below: (Suppose we enter 3 names then output should be as follows).Number of arguments = 3(Hint: An array may be used for converting from numeric values from 1 to 20 into String.)
First Student Name is =Tom
Second Student Name is =Dick
Third Student Name is =Harry
 */
public class Pratical_3_1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter student names as arguments.");
            return;
        }

        System.out.println("Number of arguments = " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("  " + (i + 1) + "th Student Name is = " + args[i]);
        }
    }
}



