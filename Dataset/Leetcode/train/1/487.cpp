 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        unordered_map<int, int> s;
        for(int i=0; i<nums.size(); i++)
            if(s.count(target-nums[i]))
                return {i, s[target-nums[i]]};
            else s[nums[i]]=i;
                
        return {};
    }
};

