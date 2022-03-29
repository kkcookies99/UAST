 class Solution {
    public int[] XXX(int[] nums, int target) {
        int n = nums.length;   //获得数组长度
        //遍历数组，寻找两个目标值
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] +nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }
}

