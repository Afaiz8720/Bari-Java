import java.util.*;
public class urlSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter domain : ");
        String domain = sc.nextLine();

        String ext = domain.substring(domain.lastIndexOf(".") + 1);
        switch(ext){
            case "com" : System.out.println("Commercial"); break ;
            case "net" : System.out.println("Network"); break ;
            case "in" : System.out.println("Industrial"); break ;
            case "org" : System.out.println("Organisation"); break ;
            default : System.out.println("Please enter valid domain");
        }
    }
}
