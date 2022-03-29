 class Solution {
public:
    int XXX(vector<int>& nums) {
        int maxnum = nums[0];
        int maxCount = nums[0];
        for(int idx = 1; idx < nums.size(); idx++)
        {
            if(maxCount + nums[idx] < nums[idx])
                maxCount = nums[idx];
            else
                maxCount += nums[idx];
                
            maxnum = max(maxnum, maxCount);
        }

        return maxnum;
    }
};

