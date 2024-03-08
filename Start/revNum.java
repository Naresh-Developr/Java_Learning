import java.util.Scanner;
public class revNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        while(input!=0){
            System.out.print(input%10);
            input = input/10;
        }
        System.out.println();
        sc.close();

    }
    
}
