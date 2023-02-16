import java.util.*;
public class findRadix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String number = sc.nextLine();

        if(number.matches("[01]+")){
            System.out.println("Binary Radix = 2");
        }
        else if(number.matches("[0-7]+")){
            System.out.println("Octal Radix = 8");
        }
        else if(number.matches("[0-9A-F]+")){
            System.out.println("Hexa Radix = 16 ");
        }
        else{
            System.out.println("Not a number");
        }
    }
}
