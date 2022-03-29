class Solution {
    public boolean XXX(int[] nums) {
       int n = nums.length;
       if(n == 0) return true;
       //当前拥有的能量
       int cur = nums[0]; 
       //当前所处的位置(数组下标)
       int i = 0;
       while(cur != 0 && i < n-1){
           //跳一格
           i ++;
           //跳一格耗费一个能量
           cur --;
           //选择更多的能量
           cur = Math.max(cur, nums[i]);
       }
       //判断是否跳到了最后一格
       return i == n-1;
    }
}

