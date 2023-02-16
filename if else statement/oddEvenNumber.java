import java.util.*;
class relational{
    public void oddEven(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        if(number%2 == 0){
            System.out.println(number + " is even");
        }
        else{
            System.out.println(number + " is odd");
        }
    }

    public void youngOrNot(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a age : ");
        int age = sc.nextInt();

        if((age >= 14) && (age <= 55)){
            System.out.println("Person is young");
        }
        else{
            System.out.println("Person is not young");
        }
    }

    public void GradeMarks(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a marks : ");
        int marks1 = sc.nextInt();
        System.out.print("Enter a marks : ");
        int marks2 = sc.nextInt();
        System.out.print("Enter a marks : ");
        int marks3 = sc.nextInt();
        System.out.print("Enter a marks : ");

        int total = (marks1 + marks2 + marks3) * 100 ;
        int percentage = total / 300 ;
        
        if(percentage >= 90 && percentage <= 98){
            System.out.println("A+ Grades");
        }
        else if(percentage >= 70 && percentage <= 89){
            System.out.println("A Grades");
        }
        else if(percentage >= 65 && percentage <= 70){
            System.out.println("B+ Grades");
        }
        else if(percentage >= 50 && percentage <= 64){
            System.out.println("B Grades");
        }
        else{
            System.out.println("F Grades");
        }
    }
    
    
}

public class oddEvenNumber {
    public static void main(String[] args) {
        relational r = new relational();
        //r.oddEven();
        //r.youngOrNot();
        r.GradeMarks();
    }
}
