 class Solution {
​    public int XXX(int[] nums) {
​        if (nums.length == 0) return 0;
​        int tmpPix = 0;//记录游标
​        for (int index = 1; index < nums.length; index++) { //迭代游标
​            if (nums[index] == nums[index - 1]) {
​                // 啥都不干
​            } else if (nums[index] != nums[index - 1]) {
​                tmpPix = tmpPix + 1;
​                nums[tmpPix] = nums[index];
​            }
​        }
​        return tmpPix+1;
​    }
}

