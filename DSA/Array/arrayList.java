import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {
        //if we dont know the size of array we use ArrayList.
        // syntax
        // ArrayList<datatype(wrapper class)> name = new ArrayList<>(initial capacity);
        ArrayList<Integer> list = new ArrayList<Integer>(10);
                 //wrapper class

        list.add(1);
        list.add(2);
        list.add(3);
        
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println(list);
        System.out.println(list.contains(3));
        System.out.println(list.remove(6));
        


        
    }
    
}
