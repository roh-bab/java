public class EncapsulatRunner{

    
    public static void main(String[] args) {
        Encapsulat e1 = new Encapsulat();
        Encapsulat e2 = new Encapsulat();//Constructor will be called as many times object is created.
        Encapsulat e3 = new Encapsulat(24,"Mohit");//This will called paramaterised constructor
        e1.setname("Rohit");
        e1.setage(27);

        System.out.println(e1.getage() + ":" + e1.getname());
        System.out.println(e1.getage() + ":" + e1.getname());
    }
}