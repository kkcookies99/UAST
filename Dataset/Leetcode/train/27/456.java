 class Solution {
    public int XXX(int[] nums, int val) {
        int last_pos = nums.length - 1;
        if(last_pos < 0){
            return 0;
        }
        while(last_pos >= 0 && nums[last_pos] == val) last_pos --;
        for(int i = 0; i < last_pos; i++){
            if(nums[i] == val){
                nums[i] = nums[last_pos];
                nums[last_pos] = val;
                while(nums[last_pos] == val) last_pos --;
            }
        }
        int cnt = nums.length - 1;
        
        while(cnt >= 0 && nums[cnt] == val) cnt --;
        return cnt + 1;
    }
}

