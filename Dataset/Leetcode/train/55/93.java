class Solution {
    public boolean XXX(int[] nums) {
        int cur = 0,n = nums.length,l = 0;
       for(int i = 0;i <n ;i++){
        if(i<=l){
             l = Math.max(nums[i]+i,l);
        }
        if(l >= n-1){
            return true;
        }         
       }
       return false;
    }
}

