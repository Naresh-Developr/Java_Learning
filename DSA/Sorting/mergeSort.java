import java.util.Arrays;

public class mergeSort {

    public static void main(String[] args) {

        int[]  arr = {9,7,5,3,1,2,4,6,8};

        int[] ans = mergesort(arr);

        System.out.println(Arrays.toString(ans));
        
    }
    static int[] mergesort(int[] arr){

        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        //mergesort(first);
        //mergesort second);
        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second){
        int[] join = new int[first.length + second.length];

        int i = 0;
        int j=0;
        int k=0;

        while(i<first.length && j < second.length){
            if(first[i] < second[j]){
                join[k] = first[i];
                i++;
            }else{
                join[k] = second[j];
                j++;
            }
            k++;
        }
// if the arry is not completed copy the remaining elements
        while(i<first.length){
            join[k] = first[i];
            i++;
            k++;
        }

        while(j<first.length){
            join[k] = second[j];
            j++;
            k++;
        }

        return join;


    }
}
