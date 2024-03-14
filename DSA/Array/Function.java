import java.util.Arrays;

public class Function {
    public static void main(String[] args) {
        
        int[] num = {23,4,5,5,6,7,8,1};

        System.out.println((num.toString())); // prints address of the object 
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }   

    static void change(int[] arr){
        arr[0] = 99;
        arr[1] = 1;

    }
}
