 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int start = 0;
        for(int num : nums)
            start ^= num;
        return start;
    }
};

