 class Solution {
    // 双重for循环
    public int XXX(int[] nums) {
        if(nums.length==0 || nums.length ==1) return nums.length;
        int i=0;
        for(;i<nums.length;i++){
            int j = i+1;
            if(j<nums.length && nums[j]>nums[i]) continue;
            boolean flag = false;
            int index = -1;
            int max = Integer.MAX_VALUE;
            for(;j<nums.length;j++){
                if(nums[j]>nums[i] && nums[j]<max){
                    flag = true;
                    max = nums[j];
                    index = j;
                }
            }
            if(!flag){
                break; // 查找不到比nums[i]来的大的值了
            }else{
                // 替换i+1 和index的位置
                int temp = nums[i+1];
                nums[i+1] = nums[index];
                nums[index] = temp;
            }
        }
        return i+1;
    }
}

