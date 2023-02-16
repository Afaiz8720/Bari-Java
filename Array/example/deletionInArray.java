package Array.example;

import java.util.*;
public class deletionInArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 7;
        arr[4] = 8;
        arr[5] = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a position :");
        int position = sc.nextInt();

        int n = 5;
        for(int i = position ; i < n ; i++)
        {
            arr[i - 1] = arr[i];
        }
        n = n - 1 ;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
