 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        std::unordered_map<int, int> map;
        for(int i = 0; i < nums.size(); i++) {
            if(map.count(target - nums[i])) {
                return {map[target - nums[i]], i};
            }
            map[nums[i]] = i;
        }
        return {};
    }
};

