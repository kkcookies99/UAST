 class Solution {
    public boolean XXX(int[] nums) {
        int cur = 0;
        int target = nums.length - 1;

        while(true){
            if(cur == target){
                return true;
            }

            //可供选择的落脚位置
            int left = cur + Math.min(1, nums[cur]);
            int right = Math.min(cur + nums[cur], target);

            //选择最靠近 target 的落脚位置
            int next = left;
            for(int i = left; i <= right; ++i){
                if(next + nums[next] <= i + nums[i]){
                    next = i;
                }
            }

            //落脚位置等于起跳位置，跳不出去
            if(next == cur){
                return false;
            }

            //往后跳
            cur = next;
        }
    }
}

