import java.util.Scanner;
public class Loop {

    public static void main(String[] args) {
        System.out.println("Enter the number to print natural numbers:");
        Scanner sc = new Scanner(System.in);

        int data = sc.nextInt();
        
        for(int i=1;i<=data;i++){
            System.out.println(i);
        }
        System.out.printf("\n");
        int i = 0;
        while(i<data){
            System.out.println(i);
            i++;

        }
        sc.close();

    }
    
}
