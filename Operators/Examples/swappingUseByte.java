 

class swapUsingByte{
    public void swapping(){
        byte a = 9 , b = 12 ;

        byte c = (byte)(a << 4);
        c = (byte)(c|b);

        System.out.println("swapped value b is : " + ((c&0b11110000) >> 4));

        byte d = (byte)(b << 4);
        d = (byte)(d|a);

        System.out.println("swapped value a is : " + ((d&0b11110000) >> 4));
    }  
}
public class swappingUseByte {
    public static void main(String args[]){
        swapUsingByte s = new swapUsingByte();
        s.swapping();
    }
}

