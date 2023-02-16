package Operators.Examples;
class parent {
    parent(){
        
    }
}

class child extends parent {
    child(){
        super();
    }
}
public class InstanceOfExam {
   public static void main(String[] args) {
    child c = new child();
    if(c instanceof parent){
        System.out.println(true);
    }
   } 
}
