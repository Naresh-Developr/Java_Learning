import java.util.Arrays;
import java.util.Scanner;

public class stringArray {
    public static void main(String[] args) {
    String[] str =  new String[5];

    System.out.println(str[4]);

    String n = null;

    Scanner sc = new Scanner(System.in);

    for(int i=0;i<str.length;i++){
        str[i] = sc.next();
    }

    System.out.println(Arrays.toString(str)); // to print

    str[4] = "loose";

    for (String i : str){
        System.out.print(i);
    }
    }

    
}