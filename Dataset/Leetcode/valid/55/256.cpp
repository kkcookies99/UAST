class Solution {
public:
    bool XXX(vector<int>& nums) 
    {
        if(nums[0]==0&&nums.size()>1)
        {
            return false;
        }
        for(int i=nums.size()-2;i>=0;i--)
        {
            if(nums[i]==0)
            {
                for(int j=0;j<i;j++)
                {
                    if(nums[j]>i-j)
                    {
                        break;
                    }
                    if(j==i-1)
                    {
                        return false;
                    }
                }   
            }
        }
        return true;
    }
};

