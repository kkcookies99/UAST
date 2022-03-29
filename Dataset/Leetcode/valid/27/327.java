 class Solution {
    public int XXX(int[] nums, int val) {
        int left = 0;
	//右指针定义为nums.length是为了防止下标越界
        int right = nums.length;
        while(left < right){
            if(nums[left] == val){
		//将nums[right - 1]赋值给左指针，同时右指针左移
                nums[left] = nums[-- right];
            }else{
                left ++;
            }
        }
        return left;
    }
}

