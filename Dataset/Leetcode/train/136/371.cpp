 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        // int res = nums[0];
        for(int i = 1;i < nums.size();++i){
            nums[0] ^= nums[i];
        }
        // cout<<res;
        return nums[0];
    }
};

