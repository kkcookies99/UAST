 class Solution {
public:
    int XXX(vector<int>& nums, int val)
     {
        int len=nums.size();
        int k=0;
        for(int j=0;j<nums.size();j++)
        {
            if(nums[j]!=val) 
            {   nums[k]=nums[j];
                k++;
            }
            else len--;
        }
        return len;
    }
};

