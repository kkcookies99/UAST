 class Solution {
public:
    int XXX(vector<int>& nums) {
        int sum = nums[0], ret = sum;
        for(int i=1; i<nums.size(); ++i){
            sum = sum < 0 ?  nums[i] : sum + nums[i];
            ret = max(sum, ret);
        }
        return ret;
    }
};

