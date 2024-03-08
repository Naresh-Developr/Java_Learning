import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        
        ArrayList<String> food = new ArrayList<String>();

        food.add("hello");
        food.add("World");

        for(int i=0;i<food.size();i++){
            System.out.println("Text: " + food.get(i));

        }

    }
}
