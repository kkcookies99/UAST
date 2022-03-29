 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        sort(nums.begin(), nums.end(), [](int a, int b){return a < b;});
        int i = 0;
        for(; i + 1 < nums.size() && nums[i] == nums[i+1]; i += 2);
        return nums[i];
    }
};

