import java.util.*;

class areaAndVolumeOfCuboid{
    public void areaOfCuboid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length :");
        int length = sc.nextInt();
        System.out.println("Enter a height :");
        int height = sc.nextInt();
        System.out.println("Enter a breadth :");
        int breadth = sc.nextInt();

        int totalArea = 2 * ((length * height) + (breadth * height) + (length * breadth));
        System.out.println("Total area of cuboid is : " + totalArea);

    } 

    public void volumeOfCuboid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length :");
        int length = sc.nextInt();
        System.out.println("Enter a height :");
        int height = sc.nextInt();
        System.out.println("Enter a breadth :");
        int breadth = sc.nextInt();

        int volume = length * breadth * height;
        System.out.println("Volume of cuboid is : " + volume);

    } 
}

public class ExampleCuboidArea {
    public static void main(String args[]){
        areaAndVolumeOfCuboid v = new areaAndVolumeOfCuboid();

        v.areaOfCuboid();
        System.out.println();
        v.volumeOfCuboid();
    }
}
