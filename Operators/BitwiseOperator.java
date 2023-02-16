

import java.util.*;
public class BitwiseOperator {
    public void bitwiseOperator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of A : ");
        int a = sc.nextInt();
        System.out.println("Enter a value of B : ");
        int b = sc.nextInt();

        System.out.println("And operator is : " + (a & b));
        System.out.println("Or operator is : " + (a | b));
        System.out.println("Not operator is : " + !(a > b) );
        System.out.println("XOR operator is : " + (a ^ b) );
        System.out.println("Right sift operator is : " + (a >> 1));
        System.out.println("Left sift operator is : " + (a << 1));
        System.out.println("Compliment operator is : " + ~(a & b));

    }
    public static void main(String args[]){
        BitwiseOperator b = new BitwiseOperator();

        b.bitwiseOperator();
    }
}
