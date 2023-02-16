import java.util.*;
public class postIncreamentAndDecreament {

    public void PostIncreamentAndDecreament(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int num = sc.nextInt();
        System.out.println("Before Post Increament number is : " + num);
        System.out.println("After Post Increament number is : " + num++);

        System.out.println();

        System.out.println("Before Post Decreament number is : " + num);
        System.out.println("After Post Decreament number is : " + num--);
    }

    public void PreIncreamentAndDecreament(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int num = sc.nextInt();
        System.out.println("Before Pre Increament number is : " + num);
        System.out.println("After Pre Increament number is : " + ++num);

        System.out.println();

        System.out.println("Before Pre Decreament number is : " + num);
        System.out.println("After Pre Decreament number is : " + --num);
    }
    public static void main(String args[]){
        postIncreamentAndDecreament p = new postIncreamentAndDecreament();

        p.PostIncreamentAndDecreament();
        System.out.println();
        p.PreIncreamentAndDecreament();
    }
}
