public class Demo{
public static void main(String[] args) {
    A obj = new B();
    obj.show();
    obj = new A();
    obj.show();
    //A obj1 = new C();// error because C is not inheriting A
}
}

class A{
    public void show(){
        System.out.println("In A show");
    }  
}

class B extends A{
    public void show(){
        System.out.println("In B show");
    }  

}

class C{
    public void show(){
        System.out.println("In A show");
    }  
}