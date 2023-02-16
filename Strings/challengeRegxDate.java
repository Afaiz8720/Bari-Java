package Strings ;
public class challengeRegxDate {
    public static void main(String[] args) {
        String date = "01/12/2000";
        System.out.println(date.matches("[0 - 3][0-9]/[0-1][0-9]/[0-9]{4}"));
    }
}
