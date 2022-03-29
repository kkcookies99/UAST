 class Solution {
public:
    int XXX(vector<int>& nums) {
        int n=nums.size();
        int f=0,z=0,sum=0;

        int ma=-2147483648;
        int mma=-2147483648;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>mma)
                mma=nums[i];
            if(nums[i]>=0)
            {
                z+=nums[i];
                sum+=nums[i];
            }
            else
            {
                f+=nums[i];
                if(f+z>=0)
                    sum+=nums[i];
                else
                {
                    f=0;
                    z=0;
                    sum=0;
                }
            }
            if(sum>ma)
                ma=sum;
        }
        if(mma<0)
            return mma;
        else
            return ma;
    }
};

