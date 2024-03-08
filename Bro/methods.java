public class methods {

    public static void main(String[] args) {
        //methods are nothing but functions

        hello("naresh");
        System.out.println(add(1));
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(3.0,4.0));

    }

    static void hello(String name){

        System.out.println("Hello "+ name);

    }
    // overloading --> method have same name with diffrent parameters[parameters can be of different data types] 
    
    static int add(int x){
        return x+1;

    }
    
    static double add(double x, double y){
        System.out.println("From double:");
        return x+y;
    }

    static int add(int x, int y){
        
        return x+y;
    }

    static int add(int x, int y,int z){
        
        return x+y+z;
    }
    
}
