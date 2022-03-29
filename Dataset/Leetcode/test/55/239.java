class Solution {
    public boolean XXX(int[] nums) {
         int flag = 0;
         if(nums.length<=1) return true;
         if(nums[0]==0) return false;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 0) {
                flag = 1;
                int j=i-1;
                for (; j >= 0; j--) {
                    if(nums[j]>=nums.length-1) return true;
                    if (nums[j] > i - j ) {
                        break;
                    }
                }
                if(j<0) return false;
            }
        }

        if (flag == 0)
            return true;

        return true;
    }
}

