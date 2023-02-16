class stringMethod{
    public void stringLength(){
        String str = "Java";
        int len = str.length();

        System.out.println("String length is : " + len);
    }

    public void upperCaseAndLowerCase(){
        String str1 = "java program";
        String str2 = "JAVA PROGRAM";

        System.out.println("Str1 Upper Case is : " + str1.toUpperCase());
        System.out.println("Str2 Lower Case is : " + str2.toLowerCase());

    }

    public void Trim(){
        String Str = "   welcome   ";

        // variableName.trim();
        System.out.println("Trim element in str : " + Str.trim());
    }

    public void subString(){
        String str = "Welcome";

        //VariableName.substring();
        System.out.println("Sub string of Welcome : " + str.substring(3));
    }
    
    public void SubString(){
        String str = "Faiz Ahmad";
        // variableName.substring(0 , end);
        System.out.println("Before convert into sub String : " + str);
        System.out.println("Sub string is : " + str.substring(0, 4));
    }

    public void Replace(){
        String str = "Maan";
        //VariableName.replace('char' , 'char');
        System.out.println("After replacing character : " + str.replace('a' , 'o'));
    }

    public void StartWith(){
        String str = "www.google.com";
        //variableName.startsWith(String);
        System.out.println("Str start with www : " + str.startsWith("www"));
    }

    public void endWith(){
        String str = "www.google.com";
        //variableName.endsWith(String);
        System.out.println("Str start with com : " + str.endsWith("com"));
    }
    
    public void charAt(){
        String name = "Java";
        //variableName.charAt(int index);
        System.out.println("Char at index : " + name.charAt(2));
    }

    public void indexOf(){
        String name = "Faiz";
        //variableName.indexOf(String);
        System.out.println("IndexOf number is : " + name.indexOf("i"));
    }

    public void lastIndex(){
        String name = "Faiz ahmad";
        System.out.println("String last index is : " + name.lastIndexOf("a",5));
    }

    public void equalsTo(){
        String str1 = "Java";
        String str2 = "Java";
        System.out.println("Str1 is equal to str2 : " + str1.equals(str2));
    }

    public void equalsToIgnore(){
        String str1 = "Java";
        String str2 = "Java";
        System.out.println("Str1 is equals as ignore case : " + str1.equalsIgnoreCase(str2));
    }

    public void compareToString(){
        String str1 = "Java";

        System.out.println("Str1 is compare to str2 : " + str1.compareTo("Ja"));
    }
}

public class StringsMethods {
    public static void main(String[] args) {
        stringMethod s = new stringMethod();

        s.stringLength();
        s.upperCaseAndLowerCase();
        s.Trim();
        s.subString();
        s.SubString();
        s.Replace();
        s.StartWith();
        s.endWith();
        s.charAt();
        s.indexOf();
        s.lastIndex();
        s.equalsTo();
        s.equalsToIgnore();
        s.compareToString();
    }
}
