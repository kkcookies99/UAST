class Solution {
    public int XXX(int[] nums) {
        //要求的是连续子数组的最大和
        //数组最少都有一个元素

        //定义长度
        int len = nums.length;

        int pre = 0;//此前元素之和

        int maxAns = nums[0];//先用第一个元素代替最大的位置
        
        //思路：当当前值前面的和为负数的话就直接丢掉，否则加上去，并且与max最大值比较
        for (int x : nums) {
            pre = Math.max(x, x + pre);//这个地方主义，其实这个地方已经做到了对前面和的正负判断了如果前面的和是负数，那么就会小于当前值，那么此时的pre就会转变成x 


            //再把当前的pre值与max值比较，比max大就换回来
            maxAns = Math.max(pre, maxAns);
        }

        return maxAns;

        
        



    }
}

