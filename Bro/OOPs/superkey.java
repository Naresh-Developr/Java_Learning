public class superkey {

    public static void main(String[] args) {
        // super --> refers to the superclass[parent class] of an object
        // similar to this.

        hero h1 = new hero("naresh",18,"laser");

        System.out.println(h1.toString());
    }

    
}

class person{

    String name;
    int age;

    person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void run(){
        System.out.println("running");
    }

    public String toString(){
        return this.name+"\n"+this.age+"\n";
    }
}
class hero extends person{
    String power;
    hero(String name,int age,String power){
        super(name, age);  // acessing the constructor data.
        this.power = power;

    }

    public String toString(){
        return super.toString() + this.power;

    }
    

}
