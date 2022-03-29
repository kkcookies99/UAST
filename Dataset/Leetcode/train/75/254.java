class Solution {
    public void XXX(int[] nums) {
        int[] ans  = new int[3];
        for(int i : nums){
            ans[i]++;
        }
        int idx = 0;
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < ans[i];j++){
                nums[idx] = i;
                idx++;
            }
        }
    }
}

