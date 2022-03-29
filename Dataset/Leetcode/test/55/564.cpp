 class Solution {
public:
    
    bool XXX(vector<int>& nums) {
        //避开0
        //每次尽可能跳跃长的长度？不对
        //从后往前找，遇到0就在0之前找有没有能跳过这个0的步数，找到起点都没找到就返回f
        //找到了就从该数之前开始继续查找0，直到找到起点
        if (nums.size() == 1 && nums[0] == 0)
            return true;
        for(int i=nums.size()-1;i>=0;--i)
        {
            if(nums[i]==0)
            {
                int j=i-1;
                for(;j>=0;--j)
                {
                    if(nums[j]>i-j|| (i == nums.size() - 1 && nums[j] >= i - j))//找到能够跳过0的长度
                    {
                        i=j;
                        break;
                    }
                }
                if(j==-1)//没有找到
                return false;
            }
        }
        return true;   
    }
};

