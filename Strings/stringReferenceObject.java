package Strings ;
public class stringReferenceObject {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        // They are point same object or refrence
        System.out.println("Str1 and Str2 point same object : " + (str1 == str2));

        String st1 = "Java";
        String st2 = new String("Java");
         // They are not pointing same object or refrence
         System.out.println("St1 and St2 point same object : " + (st1 == st2));
    }
}
