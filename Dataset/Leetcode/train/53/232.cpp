class Solution {
public:
    int XXX(vector<int>& nums) {
        int sum = nums[0];
        int sumTemp = 0;
        for(int i = 0; i < nums.size(); i++) {
            sumTemp += nums[i];
            if(sumTemp > sum)
                sum = sumTemp;
            if(sumTemp < 0)
                sumTemp = 0;
        }
        return sum;
    }
};

