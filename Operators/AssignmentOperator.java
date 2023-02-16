

class AssignmentOperator{
    public static void main(String args[]){
        int a = 20 ;
        System.out.println("Addition assign : " + (a += 2));
        System.out.println("Subtraction assign : " + (a -= 2));
        System.out.println("Multiplication assign : " + (a *= 2));
        System.out.println("Division assign : " + (a /= 2));
        System.out.println("Modulos assign : " + (a %= 2));
        System.out.println("XOR assign : " + (a ^= 2));
        System.out.println("AND assign : " + (a &= 2));
        System.out.println("OR assign : " + (a |= 2));
        System.out.println("Right sift assign : " + (a >>= 2));
        System.out.println("left sift assign : " + (a <<= 2));
        
    }
}
