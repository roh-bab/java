public class OverRid{
    public static void main(String[] args) {
        B obj = new B();
        obj.add(4,5,6);
    }

}

class A{

public int add(int n1,int n2,int n3){
    System.err.println("in A");
    return(n1+n2+n3);
}
}

class B extends A{
public int add(int n1,int n2){
    System.err.println("in B");
    return(n1+n2);
    
}
}