package DSA.Searching;

public class binarySearch {

    public static void main(String[] args) {

        int[] arr = {-17,-12,13,14,15};

        int ans = bSearch(arr,-12);
        System.out.println("Index:"+ ans);
        
    }
    
    static int bSearch(int[] arr,int target){
        
        int start = 0;
        int end = arr.length -1;
        
        while(start<=end){
            int mid = start +(end-start)/2;
            
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
        

    }
}
