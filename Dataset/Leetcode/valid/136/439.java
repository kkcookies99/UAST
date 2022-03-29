 class Solution {
    public int singleNumber(int[] nums) {
        int a = 0;
        for(int num:nums){
            a = a^num;
        }    
        return a;
    }
}

