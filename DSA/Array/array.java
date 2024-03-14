public class array{

    public static void main(String[] args) {
        //syntax
        //datatype[] varriable_name = new datatype[size]
        int[] arr; //declaration of array

        int[] num = new int[5]; // actual memeory creation in heap ,, runtime memory

        //direct decalration
        int[] num1 = {1,2,3,45,6};

        for(int i=0;i<num1.length;i++){
            System.out.println(num1[i]);
        }
    }
}