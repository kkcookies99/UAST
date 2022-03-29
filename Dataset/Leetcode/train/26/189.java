 class Solution {
    public int XXX(int[] nums) {
        int len = nums.length;
        int k = 1;
        for(int i = 0 ; i < len - 1 ; i++) {
            int j = 1;
            while(nums[i + j] == nums[i]) {
                j++;
                if(i + j >= len)
                return k;
            }
            nums[k] = nums[i + j];
            i = i + j - 1;
            k++;
        }
        return k; 
    }
}

