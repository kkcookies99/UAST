 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int n=0;
     for(int c:nums)
        n^=c;
    return n;
    }
};

