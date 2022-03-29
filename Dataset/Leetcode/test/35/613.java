 class Solution {
    public int XXX(int[] nums, int target) {
        int len = nums.length;
        int flag = 0;
        if(target < nums[0]){
            return 0;
        }else if(target > nums[len - 1]){
            return len;
        }
        for(int i = 0; i < len; i++){
            if(nums[i] < target && nums[i + 1] > target){
                flag++;
                break;
            }else if(nums[i] == target){
                break;
            }
            flag++;
        }
        return flag;
    }
}

