import java.util.Scanner;

public class Circle {
    public static void main(String args[])throws Exception{
        
        System.out.println("Lets play with circle Formulas by understanding variables bySide: ");

        System.out.println("-----------------------------------");
        System.out.println("perimeter of Circle:");

        double radius = 5;  // double data type is to store 64-bit value.
        //Double is a 64-bit floating-point number, which means that it can store up to 15 decimal digits accurately
        double pi = 3.14;

        System.out.println("perimeter: "+ pi * 2 *radius);

        System.out.println("-----------------------------------");

        System.out.println("Area of Circle:");

        Scanner sc = new Scanner(System.in);

        double rad = sc.nextDouble();

        System.out.println("Area: "+ pi * rad*rad);

        sc.close();



    }
    
}
//By default, Java uses double to represent its floating-point numerals
 // float data type is used to store 32-bit value
// which means that it can store up to 7 decimal digits accurately.