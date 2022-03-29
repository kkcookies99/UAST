 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int low=0,high=nums.size()-1;
        int ave,flag=0;
        if(target<nums[0])
        {
            return 0;
        }
        else
        {
            while(low<=high)
            {
                ave=(low+high)/2;
                if(nums[ave]>target)
                {
                    high=ave-1;
                }
                else if(nums[ave]<target)
                {
                    low=ave+1;
                }
                else if(nums[ave]==target)
                {
                    flag=1;
                    break;
                }
        }
        }
        if(flag==1)
        {
            return ave;
        }
        else if(flag==0)
        {
            if(nums[ave]>target)
            {
                return ave;
            }
            else if(nums[ave]<target)
            {
                return ave+1;
            }
        }
        return 0;
    }
};

