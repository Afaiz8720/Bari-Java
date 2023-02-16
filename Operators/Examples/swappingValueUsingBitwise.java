class swappingValues{
    public void swapping(){
        int a = 10 , b = 20 ;
        
        System.out.println("Before swapping a value " + a + " b value is " + b );

        a = a ^ b ;
        b = a ^ b ;
        a ^= b ;

        System.out.println("After swapping value is " + a + " b value is " + b );
    }
}

public class swappingValueUsingBitwise {
    public static void main(String args[]){
        swappingValues s = new swappingValues();

        s.swapping();
    }
}
