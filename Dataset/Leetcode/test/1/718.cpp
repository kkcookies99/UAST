 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        map<int, int> num;
        int len = nums.size();
        for (int i = 0; i < len; i++){
            int b = target - nums[i];
            if (!num.empty() && num.count(b)){
                return std::vector<int>{num[b], i};
            } else {
                num[nums[i]] = i;
            }
        }
        return std::vector<int>();
    }
};

