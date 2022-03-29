 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        if(nums.empty()) {
            return {};
        }
        map<int, int> temp;
        for(int i=0; i<nums.size(); i++) {
            auto iter = temp.find(target - nums[i]);
            if(iter == temp.end()) {
                temp.insert(make_pair(nums[i], i));
            }
            else {
                return {iter->second,i};
            }
        }
        return {};
    }
};

