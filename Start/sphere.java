import java.util.Scanner;

public class sphere {

    public static void main(String[] args)throws Exception {
        System.out.println("Formulas for sphere:");

        System.out.println("Enter radius of sphere");
        double pi=  3.14;

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String radius = sc.nextLine();

        double rad = Double.parseDouble(radius); // type conversion of String to Double.
        System.out.println("Area: " + 4*pi*rad);
        System.out.println("Volume: "+ 4/3 * pi * rad * rad );

        sc.close(); // prevent data leak from the input pipe 
        
    }
    
}

// 1 mile  = 1.609 km
