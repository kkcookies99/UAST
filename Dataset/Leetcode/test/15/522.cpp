 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ret;
        int n = nums.size();
        sort(nums.begin(), nums.end());
        
        for (int i = 0; i < n-2; ++i)
        {
            if (nums[i] > 0)
                break; // 已排序，第一个数大于0，直接结束
            if (i != 0 && nums[i] == nums[i-1])
                continue;
            
            int left = i+1, right = n-1;
            while (left < right)
            {
                int sum = nums[i]+nums[left]+nums[right];
                if (sum == 0)
                {
                    ret.push_back({nums[i], nums[left], nums[right]});
                    ++left;
                    --right;
                    while (left<right && nums[left]==nums[left-1]) // 去重
                        ++left;
                    while (left<right && nums[right]==nums[right+1]) // 去重
                        --right;
                }
                else if (sum < 0)
                {// 左指针右移
                    ++left;
                    while (left<right && nums[left]==nums[left-1])
                        ++left;                    
                }
                else if (sum > 0)
                {// 右指针左移
                    --right;
                    while (left<right && nums[right]==nums[right+1])
                        --right;                      
                }
            }
        }
        return ret;
    }
};

