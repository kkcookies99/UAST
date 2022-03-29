 class Solution {
public:
	bool XXX(vector<int>& nums) {
		int n = nums.size();
		int k = 0;
		for (int i = 0; i < n; i++) {
			k = max(--k, nums[i]);
			if (k==0&&i!=n-1)
				return false;
		}
		return true;
	}
};

