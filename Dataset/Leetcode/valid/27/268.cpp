 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int numsize=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]!=val)
            {
                nums[numsize]=nums[i];
                numsize++;
            }
        }
        return numsize;
    }
};

