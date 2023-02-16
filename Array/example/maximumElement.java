package Array.example;

import java.lang.*;
public class maximumElement {
    public static void main(String[] args) {
        int arr[] = { 2 , 5 , 7 , 10 , 8 };

        int maximum = Integer.MIN_VALUE ;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maximum)
            {
                maximum = arr[i];
            }
        }
        System.out.println("Maximum value in array : " + maximum);

    
    }
}
