 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        unordered_map<int, int> map(nums.size());
        for (int i = 0; i < nums.size(); i ++) {
            int key = target - nums[i];
            if (map.find(key) != map.end())
                return vector<int>({i, map[key]});
            map[nums[i]] = i;
        }
        return vector<int>();
    }
};

