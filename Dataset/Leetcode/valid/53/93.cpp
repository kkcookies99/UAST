class Solution {
public:
    int XXX(vector<int>& nums) {
        int b =  0, sum = nums[0];
        for (auto &x: nums){
            if(b < 0) b = x;
            else b = b + x;
            sum = b > sum ? b : sum;
        }
        return sum;
    }
};

