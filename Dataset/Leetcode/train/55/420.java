 class Solution {
    public boolean XXX(int[] nums) {
       int max = 0; //记录能跳的最大距离
       //从左往右依次判断每个位置能否到达
       for (int i = 0;i < nums.length;i++) {
           //max小于当前位置，说明当前位置不可到达，则最后一个也不能到达，直接返回false
           if (max < i) {
               return false;
            }
           //更新max值
           if (nums[i] + i > max) {
               max = nums[i] + i;
            }
           //若max大于等于最后一个下标，说明可到达，直接返回true
           if (max >= nums.length-1){ 
               return true;
            }
        }
        return true;
    }
}

