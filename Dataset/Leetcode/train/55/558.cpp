 class Solution {
public:
	bool XXX(vector<int>& nums) {
		int n = nums.size();
		int k = 1;
		int i = 0;
		while (k > 0 && i < n) {
			k = max(--k, nums[i]);
			if (k + i >= n - 1) return true;
                        i++;
		}
		return false;
	}
};

