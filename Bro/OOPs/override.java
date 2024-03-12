public class override {

    public static void main(String[] args) {
        
        funPlay fk = new funPlay();

        fk.talk();
    }
    
}

class funtalk{
    void talk(){
        System.out.println("The Fun Talk ");
    }
}

class funPlay extends funtalk{  // inheritance

    @Override
    void talk(){
        System.out.println("Fun Playing");
    }
}

