 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        unordered_map<int, int> map;
        for(int i = 0; i < nums.size(); i++) map[nums[i]] = i;
        for(int i = 0; i < nums.size(); i++)
        {
            auto it = map.find(target - nums[i]);
            if(it != map.end() && it->second != i)
                return {i, it->second};
        }
        return {};
    }
};

