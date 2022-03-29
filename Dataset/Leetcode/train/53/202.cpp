class Solution {
public:
    int XXX(vector<int>& nums) {
        int sum = nums[0];
        int opt = nums[0];
        for(int i = 1; i < nums.size(); i++) {
            sum = sum < 0? nums[i] : nums[i] + sum;
            if(sum > opt) {
                opt = sum;
            }
        }
        return opt;
    }
};

