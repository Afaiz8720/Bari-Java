package Strings ;
public class challengeRegularExp {
    public static void main(String[] args) {
        int b = 1000110 ;
        String str = String.valueOf(b);
        System.out.println(str.matches("[01]+"));
    }
}
