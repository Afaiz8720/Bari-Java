

import java.util.*;
import java.math.*;
class areaOfTriangle{
    public void areaOfTriangleWithHeight(){
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter base of triangle :");
       float base = sc.nextFloat();

       System.out.println("Enter height of triangle :");
       float height = sc.nextFloat();
    
       float area = (base * height)/2;
       System.out.println("Area of triangle is with height :" + area);
    }

    public void SurfaceOfTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st surface of triangle :");
        float firstSurface = sc.nextFloat();
        System.out.println("Enter 2nd surface of triangle :");
        float secondSurface = sc.nextFloat();
        System.out.println("Enter 3rd surface of triangle :");
        float thirdSurface = sc.nextFloat();
       
        float surface = ( firstSurface + secondSurface + thirdSurface)/2;
        System.out.println("Surface of triangle is : " + surface);
        
        System.out.println();

        double surfaceArea = Math.sqrt(surface * (surface - firstSurface) * (surface - secondSurface) * (surface - thirdSurface));
        System.out.println("Surface area of trangle is : " + (float)surfaceArea);

    }
}
public class ExampleOfArthimeticOperator {
    public static void main(String args[]){
        areaOfTriangle a = new areaOfTriangle();

        a.areaOfTriangleWithHeight();
        System.out.println();
        a.SurfaceOfTriangle();
    }
}

