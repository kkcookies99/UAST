 class Solution {
    public int XXX(int[] nums, int val) {
        //先排序//
        Arrays.sort(nums);
        int count=0;
        //遍历整个array//
        for(int i=0;i<nums.length;i++){
            //小于val的不用管//

            //和val相等的统计个数//
            if(nums[i]==val){
              count++;
            }
            //将剩下的值全部向前移//
            else if(nums[i]>val){
                nums[i-count]=nums[i];
            }
    }

        return nums.length-count;

    }

