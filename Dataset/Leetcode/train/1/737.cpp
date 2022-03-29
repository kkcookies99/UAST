 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
         int n = nums.size(), l = 0, r = n - 1;
        unordered_map<int, int> mp;
        for (int i = 0; i < n; i++) {
            if (mp.find(target - nums[i]) != mp.end()) {
                l = mp[target - nums[i]];
                r = i;
                break;
            }
           
        }
        return {r, l};
    }
};```
