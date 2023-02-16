import java.util.*;
import java.math.*;
class quadraticEquation{
    public void QuadraticEquation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter value of b : ");
        int b = sc.nextInt();
        System.out.println("Enter value of c : ");
        int c = sc.nextInt();

        double root1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * (a * c)))/2 * a;
        double root2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * (a * c)))/2 * a;

        System.out.println("Quadratic Equation of root 1 : " + (float)root1);
        System.out.println();
        System.out.println("Quadratic Equation of root 1 : " + (float)root2);
    }   
}
public class rootOfQuadraticEquation {
    public static void main(String args[]){
        quadraticEquation q = new quadraticEquation();
        q.QuadraticEquation();
    }
}
