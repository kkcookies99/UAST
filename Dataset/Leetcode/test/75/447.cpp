 class Solution {
public:
    void XXX(vector<int>& nums) {
        vector<int> count{0, 0, 0};
        for(auto i : nums) {
            count[i]++;
        }
        nums.clear();
        nums.insert(nums.end(), count[0], 0);
        nums.insert(nums.end(), count[1], 1);
        nums.insert(nums.end(), count[2], 2);
    }
};

