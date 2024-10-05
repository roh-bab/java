
public class Demo{
    public static void main(String[] args) {
        A obj = new B();
        obj.show1();
        B obj1 = (B) obj; //downcasted A to B , now we can use B methods
        obj1.show2();


    }
}

class A{
public void show1(){
    System.out.println("In A show");
}
}

class B extends A{
public void show2(){
    System.out.println("In B show");
}
}

