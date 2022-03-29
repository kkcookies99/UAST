 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int result=0;
        for(auto x: nums) result^=x;
        return result;

    }
};

