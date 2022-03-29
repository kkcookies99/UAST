 class Solution {
public:

    vector<vector<int>> res;

    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.size() == 0 || nums.size() == 1 || nums.size() == 2) return {};

        sort(nums.begin(), nums.end());

        for(int i = 0; i < nums.size() - 2; ++i) {
            if(nums[i] > 0) return res;

            // 去重
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1, r = nums.size() - 1;

            while(l < r) {
                if(nums[i] + nums[l] + nums[r] > 0) 
                    --r;
                else if(nums[i] + nums[l] + nums[r] < 0) 
                    ++l;
                else {
                    res.push_back({nums[i], nums[l], nums[r]});

                    // 对于目前的i，找剩下的不重复的三元组
                    while(l < r && nums[l] == nums[l + 1])
                        ++l;
                    while(l < r && nums[r] == nums[r - 1])
                        --r;
                    ++l;
                    --r;
                }
            }
        }
        
        return res;
    }
};

