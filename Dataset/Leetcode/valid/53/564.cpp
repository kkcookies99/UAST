 class Solution {
public:
	int XXX(vector<int>& nums) {
		int len = nums.size();
		//dp[i]表示以nums[i]结尾的最大连续子数组的和
		vector<int> dp(len + 1, 0);
		int res = INT_MIN;

		for (int i = 1; i <= len; ++i) {
			dp[i] = max(nums[i - 1], dp[i - 1] + nums[i - 1]);
			res = max(res, dp[i]);
		}

		return res;
	}
};

//优化
class Solution {
public:
	int XXX(vector<int>& nums) {
		int len = nums.size();
		int sum = nums[0];
		int res = sum;

		for (int i = 1; i < len; ++i) {
			sum = max(nums[i], nums[i] + sum);
			res = max(res, sum);
		}

		return res;
	}
};

