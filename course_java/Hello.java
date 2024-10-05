class A{
public A(){
     System.out.println("In A constructor");
}

public A(int n){
         System.out.println("In A int constructor");
    }
    
}

class B extends A{
    public B(){
        super();
        System.out.println("In B constructor");
    }

    public B(int n){
        this();
        
        
         System.out.println("In B int constructor");
    }
}

public class Hello{
public static void main(String[] args) {
    B obj = new B(5);

}
}