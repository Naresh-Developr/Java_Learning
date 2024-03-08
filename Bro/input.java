import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("Enter the name :");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        System.out.println("enter age: ");
        int age;
        age = sc.nextInt();
        System.out.println("Youe age: "+age);
        System.out.println("Your name is : "+ data);
        sc.close();

    }
    
}