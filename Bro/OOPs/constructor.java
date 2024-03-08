public class constructor {

    public static void main(String[] args) {

        human h1 = new human("robert",18);
        human h2 = new human("bro", 20);
        
        h2.eat();

        h1.drink();

        
    }
    
}
class human{

    String name;
    int age;

    human(String name,int age){                     //constructor initialization
        this.name = name;
        this.age = age;
    }

    void eat() {
		System.out.println(this.name+" is eating");
	}
	void drink() {
		System.out.println(this.name+" is drinking");
	}
}
