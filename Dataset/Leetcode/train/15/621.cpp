 class Solution {
public:
	vector<vector<int>> XXX(vector<int>& nums) {
		int n = nums.size();
		vector<vector<int>>res;
		sort(nums.begin(), nums.end());

		for (int i = 0; i < n - 2; ++i) {
			//当前值和上一轮相等，跳过
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			//最小组合仍大于target，不存在要求组合，跳出循环
			//因为在之后的循环找不到更小的组合
			if (nums[i] + nums[i + 1] + nums[i + 2] > 0) {
				break;
			}
			//最大组合仍小于target，不存在要求组合，跳过本轮
			//因为在之后的循环还有更大的组合
			if (nums[i] + nums[n - 1] + nums[n - 2] < 0) {
				continue;
			}

			int l = i + 1, r = n - 1;
			while (l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if (sum == 0) {
					res.push_back({ nums[i], nums[l], nums[r] });
					//跳过相同数字
					while (l < r && nums[l] == nums[l + 1]) {
						++l;
					}
					++l;
					while (l < r && nums[r] == nums[r - 1]) {
						--r;
					}
					--r;
				}
				else if (sum > 0) {
					--r;
				}
				else {
					++l;
				}
			}
		}

		return res;
	}
};

