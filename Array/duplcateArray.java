package Array;

class duplicates{
    public boolean duplicatesInArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                return true ;
            }
        }
        return false ;
    }
}
public class duplcateArray {
    public static void main(String[] args) {
        int arr[] = { 2 , 2 , 1 , 3 , 4};

        duplicates s = new duplicates();

        boolean ans = s.duplicatesInArray(arr);

        if(ans){
            System.out.println("Duplicates present in array");
        }
        else{
            System.out.println("Duplicates not present in array");
        }  
    }
}
