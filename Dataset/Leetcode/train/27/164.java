 class Solution {
    public int XXX(int[] nums, int val) {
		if(nums.length == 0){
			return 0;
		}
		int temp = 0;//动态记录有几个要去掉的数
		int i = nums.length-1;
		while(i >= 0){//从后往前遍历
			if(nums[i] == val){//如果碰到了要去掉的数
				nums[i] = nums[nums.length - ++temp];//就将后面的数放到要去掉的数的位置上
				i--;
			}else{
				i--;//否则跳过
			}
		}
		return nums.length - temp;
    }
}

