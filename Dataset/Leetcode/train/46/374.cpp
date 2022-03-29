class Solution {
public:
	vector<vector<int>> XXX(vector<int>& nums) {
		// Method 1 DFS递归 与39题 组合总和有点相似
		int len = nums.size();

		if (len == 0) return vector<vector<int>>();

		vector<vector<int>> res;
		vector<int> seq;
		dfs(res, seq, nums,0, len);

		return res;
	}

	void dfs(vector<vector<int>>& res, vector<int>& seq, vector<int>& nums ,int cnt ,int len) {
		if (cnt == len) {
			// 当seq长度增长到排列长度时 停止递归 将seq加入结果
			res.push_back(seq);
			return;
		}

		// 将seq中的元素对应的nums标记为INT_MAX 防止再次遍历
		for (int i = 0; i < len; i++) {
			if (nums[i] == INT_MAX) continue; // nums[i]已经在seq中出现

			int tmp = nums[i]; // 先保存nums[i]本来的值
			seq.push_back(nums[i]);
			nums[i] = INT_MAX; // 将nums[i]的值 置为INT_MAX
			dfs(res, seq, nums, cnt + 1, len);
			nums[i] = tmp; // 当前dfs完后 恢复nums[i]的值 准备下个循环的dfs
			seq.pop_back(); // 弹出压入seq的nums[i]
		}
	}
};

