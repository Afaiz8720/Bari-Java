package Strings;
import java.util.*;

public class typeOfWebsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your URL : ");
        String url = sc.nextLine();

        String protocol = url.substring(0 , url.indexOf(":"));

        if(protocol.equals("http")){
            System.out.println("Hypertext Transfer Protocol");
        }
        else if(protocol.equals("ftp")){
            System.out.println("File Transfer Protocol");
        }

        String ext = url.substring(url.lastIndexOf(".") + 1);

        if(ext.equals("com")){
            System.out.println("commercial");
        }
        else if(ext.equals("org")){
            System.out.println("Organisation");
        }
        else if(ext.equals("net")){
            System.out.println("Network");
        }
    }
}
