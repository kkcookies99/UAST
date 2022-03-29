 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int num = 0;
        for_each(nums.begin(), nums.end(), [&num](int n){ num ^= n;});
        return num;
    }
};

