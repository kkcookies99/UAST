 class Solution {
    public int XXX(int[] nums, int val) {
        if(nums == null){
            return 0;
        }
        int len = nums.length;
        if(len == 1){
            return nums[0] != val ? 1 : 0;
        }

        int valNum = 0;
        int index = len-1;
        for(int i = 0;i<len;i++){
            //如果为val，则从后把数移动到此位置
            if(nums[i] == val){
                //从后往前找到不等于val的数
                while(index >= 0 && nums[index] == val){
                    index--;
                }
                //index没越界
                if(index>=0){
                    nums[i] = nums[index--];
                }
                valNum++;
            }
        }
        return len-valNum;
    }
}

