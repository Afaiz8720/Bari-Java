package Strings ;
class challenge3{
    public void removeSpecialChar(){
        String str = "a!B@c#1$2%3";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
    }

    public void removeSpace(){
        String str = "a!B @c#  1$2  %3";
        System.out.println(str.replaceAll(" ",""));
    }
}

public class challengeRegxString {
    public static void main(String[] args) {
        challenge3 c = new challenge3();

        c.removeSpecialChar();
        c.removeSpace();
    }
}
