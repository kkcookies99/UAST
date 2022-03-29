class Solution {
public:
    int XXX(vector<int>& nums) {
        int sum = 0;
        int maxNum = nums[0];
        
        for(auto i : nums)
        {
            sum += i;
            if(sum > maxNum)
                maxNum = sum;
            if(sum < 0)
                sum = 0;
        }
        return maxNum;
    }
};

