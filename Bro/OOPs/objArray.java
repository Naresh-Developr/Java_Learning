public class objArray {
    public static void main(String[] args) {
        
        fun f1 = new fun("foo");
        fun f2 = new fun("boo");

        fun funArray[] = {f1,f2};

    //  data type --> class name ,, f1 & f2 --> object name ,, funArray[] --> array name [data type array]

    System.out.println(funArray[0].name);
    System.out.println(funArray[1]);  // it shows className@addressof objects it refers
    
    


    }
    
}

class fun{
    String name;
    
    fun(String name){
        this.name = name;
    }
}
