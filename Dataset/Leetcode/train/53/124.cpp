class Solution {
public:
    int XXX(vector<int>& nums) {
        int MAX = nums[0], i, sum = 0;
        for(i = 0;i < nums.size(); i++){
            sum += nums[i];
            if(sum > MAX)
                MAX = sum;
            if(sum < 0)
                sum = 0;
        }
        return MAX;
    }
};
