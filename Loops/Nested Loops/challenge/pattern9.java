public class pattern9 {
    public static void main(String[] args) {
        int px = 5 , py = 5 ;
        for (int i = 1 ; i <= 5 ; i++) {
            for (int j =  1 ; j < 5 * 2 ; j++) {
                if(j >= px && j <= py){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            px-- ;
            py++ ;
            System.out.println();
        }
    }
    
}

