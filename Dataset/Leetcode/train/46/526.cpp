 class Solution {
public:
	int n;
	vector<bool> st;
	vector<int> path;
	vector<vector<int>> ans;
	vector<vector<int>> XXX(vector<int>& nums) {
		n = nums.size();
		st = vector<bool>(n);
		dfs(nums,0);
		return ans;
	}
	void dfs(vector<int>& nums,int u) {
		if (u == n) {
			ans.push_back(path);
			return;
		}
		for (int i = 0; i < n; i++) {
			if (!st[i]) {
				st[i] = true;
				path.push_back(nums[i]);
				dfs(nums,u+1);
				path.pop_back();
				st[i] = false;
			}
		}
	}
};

