package Array.example;

public class reverseCopying {
    public static void main(String[] args) {
        int arr[] = { 2 , 5 , 1 , 7 , 8 };
        int arr1[] = new int[10];
        int n = arr.length ;

        System.out.println("Before reverse copying");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0 ; i < arr.length ; i++) {
                arr1[i] = arr[i];
        }
        
        System.out.println("\nAfter reverse copying");
        for (int i = n - 1; i >= 0 ; i--) {
            System.out.print(arr1[i] + " ");
        }
       
    }
}