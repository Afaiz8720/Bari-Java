package Operators.Examples;

public class instanceOf {
    public static void main(String[] args) {
        String str = "Java";
        String str1 = new String("Java");
        if(str instanceof java.lang.String){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
