 class Solution {
    public int singleNumber(int[] nums) {
        int x=0;
        for(int n:nums){
            x=x^n;
        }
        return x;
    }
}

