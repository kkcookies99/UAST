class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length == 1) {
            return true;
        }
        int n = -2; 
        for(int i=nums.length - 2;i>=0;i--) {
             // 从后往前找，把当前过不了的坑的位置记录起来
            if(nums[i] == 0 && n<=-1) {  
                // 如果遇到新的坑并且当前没有坑，则记录坑的位置
                n = i;
                continue;
            }
            if(n>=0 && nums[i] > (n-i)) {   // 如果发现元素的值大于元素和坑的距离，说明可以跳过这个坑，将坑的下标置为-1，继续往前找坑
                n = -1;
            }
        }
        // 走到起点发现没有记录到坑，说明可以跳过去，否则返回false
        return n<0;
    }
}

