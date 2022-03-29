 class Solution {
public:
    int XXX(vector<int>& nums) {
	int sum = 0, maxVal = nums[0];
	for (const int& num : nums)
	{
	     sum = sum < 0 ? num : (sum + num);
	     maxVal = max(sum, maxVal);
	}
	return maxVal;
    }
};

