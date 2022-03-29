 class Solution {
public:
	int XXX(vector<int>& nums) {
		vector<int> dp;
		dp.push_back(nums[0]);
		int results = dp[0];
		for (int i = 1; i < nums.end()-nums.begin(); i++) {
			dp.push_back(max(dp[i - 1] + nums[i], nums[i]));
			results = max(dp[i], results);
		}
		return results;
	}
};

