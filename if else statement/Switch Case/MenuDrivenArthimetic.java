import java.util.*;

public class MenuDrivenArthimetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Operator : ");
        String operator = sc.nextLine();
        int a = 10 , b = 5 ;
        switch (operator) {
            case "+" : System.out.println("Addition : " + ( a + b)); break ;
            case "-" : System.out.println("Subtraction : " + ( a - b)); break ;
            case "*" : System.out.println("Multiplication : " + ( a * b)); break ;
            case "/" : System.out.println("Division : " + ( a / b)); break ;
            case "%" : System.out.println("Modulos : " + ( a % b)); break ;
        }
    }
}
