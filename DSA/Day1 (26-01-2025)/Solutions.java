//Solution Problem 1://
class Solution {
    public boolean check(int[] nums) {
    int c = 0;
    for(int i=0;i <nums.length; i++){
        if(nums[i]>nums[(i+1)%nums.length]){
            c++;
        }
        if(c > 1){
            return false;
        }
    }
    return true;
        
    }
}



//Problem 2://
class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;

        for(int j=1 ; j<nums.length ;  j++) {
            if(nums[j] != nums[i]) {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    
    }
}



//Problem 3://
class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        int arr[] =new int[n];
        for(int i=0 ;i<n;i++){
            int news= i+k;
            while(news>=n){
                news= news - n;
            }
            arr[news]= nums[i];
        }
     
        for (int i=0; i<n; i++) {
            nums[i] = arr[i];
        }
        
    }
}
