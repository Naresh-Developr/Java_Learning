import java.util.Arrays;

public class cyclicSort {

    public static void main(String[] args) {
        int[] arr = {3,2,5,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int arr[]){
        int i=0;
        while(i<arr.length){
            int cor = arr[i]-1;
            if(arr[i] != arr[cor]){
                swap(arr,i,cor);
            }else{
                i++;
            }
        }

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] != arr[i]-1){
        //         swap(arr,i,arr[i]-1);
        //     }
        // }
    }
    static void swap(int[] arr,int first,int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
}
}
