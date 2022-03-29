class Solution {
    public boolean XXX(int[] nums) {
        /*要跳跃到最后一个位置，简单来讲分为两种情况：
            1.数组中没有0，则可以每一次只跳一步到达终点
            2.数组中有0的情况：对于每一个0，如果能跳过该0则能到达终点，要求左边起点一定非0，并且左边起点一定可达
            */
        int len = nums.length;
        if(nums[0] == 0 && len > 1)
        {
            return false;
        }
        //最后一个0不需要进行判断
        for(int i = 1; i < len-1; i++)
        {
            //对于0，向左遍历
            if(nums[i] == 0)
            {
                int flag = 0;
                for(int j = i-1; j>=0; j--)
                {
                    if(nums[j] > (i-j))
                    {
                        flag = 1;
                        break;
                        
                    }
                }
                if(flag==0)
                {
                     return false;
                }
               
            }
        }
        return true;
    }
}

