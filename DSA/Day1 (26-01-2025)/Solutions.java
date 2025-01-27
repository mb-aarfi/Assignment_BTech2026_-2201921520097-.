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
