package DSA.Searching;

public class linearSearch {

    public static void main(String[] args) {

        int[] nums = {8,7,6,5,4,3,2,1,0};
        int ans_index = lSearch(nums,9);

        System.out.println(ans_index);
        
        String name = "naresh";
        boolean ans = lSearch1(name,'a');
        System.out.println(ans);


        
        
    
    }
    
    static int lSearch(int[] arr,int target){
        
        if(arr.length<1){
            System.out.println("No Elements in the Array");
            return -1;
        }
        
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        System.out.println("Element not found");
        return 0;
    }


    static boolean lSearch1(String arr, char c)
    {

        if(arr.length()==0){
            return false; 
        }
        for(int i=0;i<arr.length();i++){
            if(c == arr.charAt(i)){
                return true;

            }

        }
        System.out.println("Element not Found");
        return false;
    
    }

}
