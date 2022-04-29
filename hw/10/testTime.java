import java.util.Date;
import java.util.Scanner;
public class testTime{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time1 (hour minute second): ");
        int hour = input.nextInt();
        int min = input.nextInt();
        int sec = input.nextInt();
        Time t1 = new Time(hour, min, sec);
        System.out.println(t1.toString());
        System.out.println("Elapsed seconds in time11: " + t1.getTimePassed());
        System.out.println("Enter time2 (elapsed time): ");
        long timePassed = input.nextLong();
        Time t2 = new Time(timePassed);
        System.out.println(t2.toString());
        System.out.println("Elapsed time in time2: " + t2.getTimePassed());
        System.out.println("Time1.compareTo(Time2)??: " + t1.compareTo(t2));
        System.out.println("time3 is created as a clone of time1: ");
        Time time3 = (Time) t1.clone(); // Time 3 object is the same reference of time1.
        System.out.println("time1.compareTo(time3)?: "  + t1.compareTo(time3));
        input.close();
    }
}
class Time implements Comparable<Time>, Cloneable {
  public long timePassed = (new Date()).getTime();
  private int sec;
  private int minute;
  private int hour;

  public Time() {
    // Conversion to total elapsed seconds.
    hour = (int) (timePassed / (1000 * 60 * 60));
    minute = (int) (timePassed / (1000 * 60));
    sec = (int) (timePassed / 1000);
  }

  public Time(long elapsedSeconds) {
    timePassed = elapsedSeconds;
    hour = (int) (timePassed / (24 * 60));
    minute = (int) (timePassed / (60));
    sec = (int) (timePassed % (hour + minute));
  }

  public Time(int hour, int minute, int sec) {
    this.hour = hour;
    this.minute = minute;
    this.sec = sec;
    timePassed = ((hour * 60 * 60) + (minute * 60) + (sec));
  }

  public int getHour() {
    while (hour > 24) {
      hour = hour - 24;
    }
    return hour;
  }

  public int getMinute() {
    while (minute > 60) {
      minute = minute - 60;
    }
    return minute;
  }

  public int getSecond() {
    while (sec > 60) {
      sec = sec - 60;
    }
    return sec;
  }

  public long getTimePassed() {
    return timePassed;
  }
  public String toString(){
    return (getHour() + " hour(s) and " + getMinute() + " minute(s) and " + getSecond() + "second(s).");
  }

  public int compareTo(Time o) {
    if (timePassed == o.timePassed)
      return 0;
    else if (timePassed > o.timePassed)
      return (int) (timePassed - o.timePassed);
    else
      return ((int)(o.timePassed - timePassed)) * -1;
  }
  @Override
  public Object clone(){ // overridden abstract method from cloneable.
    try{
        return super.clone();
    }
    catch (CloneNotSupportedException ex){
        return null;
    }
  }
}