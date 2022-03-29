class Solution {
public:
    int XXX(vector<int>& nums) {
        int result = nums[0];
        int sum = 0;
        for(const auto &ele : nums) {
            sum += ele;
            if(sum > result) result = sum;
            if(sum<0) sum = 0;
            
        }
        return result;
    }
};

