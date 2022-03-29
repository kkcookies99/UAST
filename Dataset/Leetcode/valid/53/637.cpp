 class Solution {
public:
	int XXX(vector<int>& nums) {
        if(nums.empty())    return 0;
        int sum = 0, max;
        max = nums[0];
        for(int i:nums){
            sum += i;
            if(sum < i)  sum = i;
            if(sum > max)   max = sum;
        }
        return max;
	}
};

