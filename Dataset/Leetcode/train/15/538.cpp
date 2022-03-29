 class Solution {
public:
	vector<vector<int>> XXX(vector<int>& nums) {
		int len = nums.size();
		if (len < 3) {
			return {};
		}

		sort(nums.begin(), nums.end());
		vector<vector<int>> res;

		for (int i = 0; i < len - 2; ++i) {
			//重复数字跳过
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int target = -nums[i];
			int l = i + 1, r = len - 1;
			while (l < r) {
				//重复数字跳过
				if (l > i + 1 && nums[l] == nums[l - 1]) {
					++l;
					continue;
				}

				if (nums[l] + nums[r] == target) {
					res.push_back({ nums[i], nums[l], nums[r] });
					++l;
				}
				else if (nums[l] + nums[r] < target) {
					++l;
				}
				else {
					--r;
				}
			}
		}

		return res;
	}
};

