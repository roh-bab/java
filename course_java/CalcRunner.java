
public class CalcRunner{
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.add(4,6));
        System.out.println(obj.sub(6,4));
        AdvCalc obj1 = new AdvCalc();
        System.out.println(obj1.add(4,6));
        System.out.println(obj1.sub(6,4));
        System.out.println(obj1.multi(4,6));
        System.out.println(obj1.div(6,4));
    }
}