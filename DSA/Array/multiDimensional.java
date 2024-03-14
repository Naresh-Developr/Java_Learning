import java.util.Scanner;

public class multiDimensional {

    public static void main(String[] args) {
        //syntax
        //int[][] name = new int[size of row][size of column]
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[3][3]; // declaration

        int[][] num1 = {
            {1,2,3},
            {2,3,4},
            {3,45,5}
        }; // initialization

        //input

        for(int i =0;i< num.length;i++){
            for(int col=0;col < num[i].length;col++){
                num[i][col] = sc.nextInt();
            }
        }

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.println(num[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
}
