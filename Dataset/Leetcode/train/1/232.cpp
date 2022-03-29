 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        std::unordered_map<int,int> hash;
        for (int i = 0; i < nums.size(); i++) {
            auto iter = hash.find(target - nums[i]);
            if (iter != hash.end())
                return vector{iter->second, i};
            hash[nums[i]] = i;
        }
        return vector<int>();
    }
};

