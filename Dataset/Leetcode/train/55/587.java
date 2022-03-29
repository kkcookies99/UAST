 class Solution {
    public boolean XXX(int[] nums) {
        int l = nums.length;
        boolean[] res = new boolean[l];
        res[0] = true;
        for(int i = 1;i<l;i++){
            for(int j = 0;j<i;j++){
                if(res[j]&&(nums[j]>=(i-j))){
                    res[i] = true;
                    break;
                }
            }
        }
        return res[l-1];
    }
}

