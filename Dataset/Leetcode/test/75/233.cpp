class Solution {
public:
    void XXX(vector<int>& nums) 
    {
        int zcnt = -1,ocnt=-1;
        for(int i=0;i<nums.size();++i)
        {
            if(nums[i]==0)
            {
                nums[i] = nums[++ocnt];
                nums[ocnt]=1;
                nums[++zcnt]=0;
            }
            else if(nums[i]==1)
            {
                nums[i] = nums[++ocnt];
                nums[ocnt]=1;
            }
        }
    }
};

