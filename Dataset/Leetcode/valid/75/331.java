class Solution {
    public void XXX(int[] nums) {
        //只需要分类0和2就行
        if(nums==null||nums.length<=1) return;
        int left = 0;
        int right = nums.length-1;
        int curr = 0;
        while(curr<=right) {
            //只要当前的值是0那么就放在最前面,是2就放最后
            //只有0和1的时候需要指针进行遍历,因为换一个2过来还得把2换到后面去
            if(nums[curr]==0) {
                swap(nums,curr,left);
                left++;
                curr++;
            }else if(nums[curr]==2) {
                swap(nums,curr,right);
                right--;
            }else curr++;
        }
    }
    public void swap(int[] nums,int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

