

public class array {
    public static void main(String[] args) {
        
        String[] car = {"hundai","kido","bro"};
        int[] a = {1,2,3,4,5,};
         for(int j=0;j<a.length;j++){
            System.out.println("num: "+a[j]);
         }

        for(String s : car){
            System.out.println("car name: "+ s);
        }
    }
    
}
