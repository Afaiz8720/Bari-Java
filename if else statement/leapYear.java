import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year + " Leap year");
                }
                else{
                    System.out.println(year + " Not a leap year");
                }
            }
            else{
            System.out.println(year + " Leap Year");
            }
        }
        else{
            System.out.println(year + " is not leap year");
        }
    }
}
