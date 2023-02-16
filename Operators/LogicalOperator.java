public class LogicalOperator {
    public static void main(String args[]){
        int a = 10 , b = 20 ;
        System.out.println("AND OPERATION : " + ((a > b) && (b < a)));
        System.out.println("OR OPERATION : " + ((a > b) || (b > a)));
        System.out.println("NOT OPERATION : " + (!(b < a)));

    }
}

