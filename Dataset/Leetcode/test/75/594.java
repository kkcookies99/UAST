 class Solution {
    public void XXX(int[] nums) {
        int one = 0;
        int two = 0;
        for(int n : nums)
            if(n == 1)
                one ++;
            else if(n == 2)
                two ++;
        int len = nums.length;
        int zero = len - one - two;
        for(int i = 0 ; i < len ; i ++)
        {
            if(zero > 0)
            {
                nums[i] = 0;
                zero --;
            }else if(one > 0)
                {
                    nums[i] = 1;
                    one --;
                }
            else
                nums[i] = 2;
            }
        }
        
}

