import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {

        int[] arr = {3,4,5,6,2,5,6,7,4,3,65,3,23,6,7,0};
        
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void SelectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;

            int maxIndex = getMax(arr,0,last);

            swap(arr, maxIndex,last);
        }

    }

    static void swap(int[] arr,int first,int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMax(int[] arr, int start, int last) {
    
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max = i;

            }

        }
        return max;

    
    }
}
