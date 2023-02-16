package Array.example;

public class rotatingArray {
    public static void main(String[] args) {
        int arr[] = { 1 , 2 , 3 , 4 , 5 , 6 };
        
        System.out.println("Before rotating");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int temp = arr[0];

        for (int i = 1 ; i < arr.length ; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp ;

          
        System.out.println("\nAfter rotating");
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

