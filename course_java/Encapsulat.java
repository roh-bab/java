public class Encapsulat {

    private int age ;
    private String name;

    public Encapsulat(){
        age = 32;
        name = "Moeti";
        System.out.println(age + ":"+ name + " From constructor");
    }
    public Encapsulat(int age,String name){
        this.age = age;
        this.name = name;
        System.out.println(age + ":"+ name + " From paramaterised constructor");
    }
    public int getage(){
        return age;
    }

    public String getname(){
        return name;
    }

    public void setage(int age){
        this.age = age;

    }

    public void setname(String name){
        this.name = name;
    }
    

    
}