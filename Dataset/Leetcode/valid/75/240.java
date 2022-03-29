class Solution {
    public void XXX(int[] nums) {
     int l0 = 0;
        int l1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            nums[i]=2;// 先全部设置为2
            if (temp<2){
                nums[l1]=1; // 把小于2的全部设置为1 此时1的数量包含了1&0
                l1++;
            }
            if (temp <1){
                nums[l0]=0;
                l0++;// 小于1的部分全部设置为0 那么剩下的部分就是1 
            }
        }
        }
}

