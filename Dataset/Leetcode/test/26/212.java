 class Solution {
    public int XXX(int[] nums) {
		if(nums.length == 0){
			return 0;
		}
		int temp = 1;//记录不重复的个数
		int i = 0;//判断条件
		int num = nums[0];//不重复的数是什么
		while(i < nums.length){
			if(num != nums[i]){//如果碰到了不是重复的数
				num = nums[i];//更新这个数
				nums[temp++] = num;//将不重复的数替换到上一个不重复的数的后面
				i++;
			}else{
				i++;//碰到重复的数直接过
			}
		}
		return temp;
    }
}