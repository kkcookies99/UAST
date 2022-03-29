class Solution {
    public void XXX(int[] nums) {
        int start = 0; 
		int end = nums.length -1;
		for (int i = 0; i <= end; i++) {
			if(nums[i] == 0) {
				//调换当前位置的数据
				int tmp = nums[start] ;
				nums[start] = nums[i];
				nums[i] = tmp;
				//把头指针向后移一
				start ++;
			}else if(nums[i] == 2) {
				//当前数据与与结尾调换
				int tmp = nums[end];
				nums[end] = nums[i];
				nums[i] = tmp;
				//尾指针 向前移1
				end--;
				//可能会出现数据都是2的，从而忽略这个值，头指针-1从新对比
				i--;
				
			}
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


