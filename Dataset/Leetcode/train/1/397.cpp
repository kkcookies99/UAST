 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        vector<int> res;
        map<int, int> hashMap;
        
        for (int i = 0; i < nums.size(); i++)
        {
            if (hashMap.count(nums[i]) > 0 )
            {
                res.push_back(hashMap[nums[i]]);
                res.push_back(i);
                return res;
            }

            int diff;
            diff = target - nums[i];
            hashMap[diff] = i;
        }
        return res;
    }
};

