 class Solution {
    public int singleNumber(int[] nums) {
        int i = 0,k = 0;
        while (i < nums.length){
            k = k^nums[i];
            i++;
        }
        return k;
    }
}

