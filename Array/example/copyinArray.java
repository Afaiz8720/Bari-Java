package Array.example;

public class copyinArray {
    public static void main(String[] args) {
        int arr[] = { 2 , 5 , 1 , 7 , 8 };

        int arr1[] = new int[10];

        System.out.println("Before copying Array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
                arr1[i] = arr[i];
            
        }
        
        System.out.println("\nAfter copying Array ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
       
    }
}