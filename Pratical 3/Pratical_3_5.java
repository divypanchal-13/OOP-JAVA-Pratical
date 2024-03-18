/*
 5.	Define a class Time with hours and minutes astwo data members, add necessary member functions to initialize and display data of class. Do not use constructors in a class. Define a member function sum () which adds two Time objects. (Use the statements like T3.sum (T1, T2)).
 */


public class Pratical_3_5 {
    
  public static void main(String[] args) {
    Time t1 = new Time();
    Time t2 = new Time();

    t1.initialize(2, 30);
    t2.initialize(8, 15);

    System.out.print("Time 1: ");
    t1.displayTime();

    System.out.print("Time 2: ");
    t2.displayTime();

    Time t3 = new Time();
    t3.sum(t1, t2);

    System.out.print("Sum of Time 1 and Time 2: ");
    t3.displayTime();
  }
}

class Time {
    private int hours;
    private int minutes;

    public void initialize(int hrs, int mins) {

      hours = hrs % 24;

      minutes = mins % 60;
      this.hours = hours;
      this.minutes = minutes;
    }

    public void displayTime() {
      System.out.printf("%02d:%02d\n", hours, minutes);
    }

    public void sum(Time t1, Time t2) {
      int totalMinutes = t1.minutes + t2.minutes;
      minutes = totalMinutes % 60;
  
      int totalHours = t1.hours + t2.hours + totalMinutes / 60;
      hours = totalHours % 24;
    }
}
  
