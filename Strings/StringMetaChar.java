package Strings ;
public class StringMetaChar {
    public static void main(String[] args){
        String str1 = "a";
        System.out.println(str1.matches("\\w"));

        String str2 = "5";
        System.out.println(str2.matches("\\d"));

        System.out.println(str2.matches("\\s"));
    }
}
