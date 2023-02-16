package Array.example;

public class reverseArray {
    public static void main(String[] args) {
        int arr[] = { 2 , 5 , 1 , 7 , 8 };
        int n = arr.length - 1;
        System.out.println("Before reversing array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\nAfter reversing array ");
        for (int i = n ; i >= 0 ; i--) {
                System.out.print(arr[i] + " ");  
        }
    }
}