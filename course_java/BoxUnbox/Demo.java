public class Demo{
    public static void main(String[] args) {
        int num1 = 9;
        Integer num = new Integer(num1); //boxing
        Integer num2 = num1;  //autoboxing

        int num3 = num2.intValue();//unboxing
        int num4 = num2; //autounboxing

        String str = "12";
        int num5 = Integer.parseInt(str);
        System.out.println(num +":" + num2 +":" + num3 + ":" +num4 + ":" +num5);

    }
}