class Solution {
public:
    int XXX(vector<int>& nums) {
        int res = nums[0];
        int sum = nums[0];
        for( int i=1;i<nums.size();i++ ){
            if(sum<0)sum = 0;
            sum = max(nums[i], nums[i]+sum);
            res = max(res, sum);
        }
        return res;
    }
};

