class Solution {
public:
    void XXX(vector<int>& nums) {
        int i=0,j=nums.size()-1;
        while(i<j)
        {
            if(nums[i]==nums[j]&&nums[j]==1)
            {
                for(int k=j;k>i;k--)
                if(nums[k]==2)
                swap(nums[k],nums[j]);
            }
            if(nums[i]==0)
            {i++;continue;}
            if(nums[j]==2)
            {j--;continue;}
            if(nums[j]>=nums[i])
            j--;
            if(nums[i]>nums[j])
            swap(nums[i],nums[j]);
        }
    }
};

