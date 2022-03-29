 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        unordered_map<int, int> map;
        for(int i = 0; i < nums.size(); i++) map[nums[i]] = i;
        for(int i = 0; i < nums.size(); i++)
        {
            if(map[target - nums[i]] && i != map[target - nums[i]])
                return {i, map[target - nums[i]]};
        }
        return {};
    }
};

