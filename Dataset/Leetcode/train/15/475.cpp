 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> out;
        if(nums.size() < 3)
            return out;
        sort(nums.begin(), nums.end());
        for(int i = 0; i < nums.size()-1; ++i)
        {
            if(nums[i] > 0)
                break;
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int res = 0 - nums[i];
            int left = i+1;
            int right = nums.size()-1;
            while(left < right)
            {
                if(nums[left]+nums[right] > res)
                    --right;
                else if(nums[left]+nums[right] < res)
                    ++left;
                else
                {
                    out.push_back( vector<int>{nums[i], nums[left], nums[right]});
                    while( left < nums.size()-1 && nums[left] == nums[left+1])
                        ++left;
                    while(right >0 && nums[right] == nums[right-1])
                        --right;                  
                    ++left;
                    --right;
                }
            }
            if(nums[i]  == 0)
                break;
        }
        return out;
    }
};

