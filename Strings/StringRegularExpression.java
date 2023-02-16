class stringRegularEx{
    public void StringMatch(){
        String str1 = "f";
        //if there is dot(.) means that string match any character
        System.out.println(str1.matches("."));

        String str2 = "a";
        System.out.println(str1.matches("[abc]"));

        String str3 = "p";
        System.out.println(str1.matches("[^abc]"));

        String str4 = "A";
        System.out.println(str1.matches("[a-zA-Z0-9]"));

        String str5 = "a7";
        System.out.println(str1.matches("[a-z][0-9]"));
    }
}

public class StringRegularExpression {
    public static void main(String[] args) {
        stringRegularEx s = new stringRegularEx();

        s.StringMatch();

    }
}
