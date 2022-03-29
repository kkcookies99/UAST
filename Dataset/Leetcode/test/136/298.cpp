 class Solution {
public:
    //两个数相同，考虑异或
    int singleNumber(vector<int>& nums) {
        int ans = 0;
        for(int i : nums) {
            ans = ans^i;
        }
        return ans;
    }
};

