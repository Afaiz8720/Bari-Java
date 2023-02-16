package Loops;

public class continueOuterLoop {
    public static void main(String[] args) {
        outer : for(int i = 1 ; i <= 5 ; i++){
            for(int j = 5 ; j >= 1 ; j--){
                if(i == j){
                    continue outer ;
                }
                else{
                    System.out.println(" i = " + i + " j = " + j);
                }
            }
        }
    }
}
