 class Solution {
public:
	void dfs(vector<vector<int>>& ret, set<int>& nums, vector<int>& cur) {
		if (0 == nums.size()) {
			ret.push_back(cur);
			return;
		}
		set<int> tmp = nums;
		for (auto i : nums) {
			cur.push_back(i);
			tmp.erase(i);
			dfs(ret, tmp, cur);
			tmp.insert(i);
			cur.pop_back();
		}
	}

	vector<vector<int>> XXX(vector<int>& nums) {
		set<int> tmp;
		vector<vector<int>> ret;
		vector<int> cur;
		for (auto i : nums) {
			tmp.insert(i);
		}
		dfs(ret, tmp, cur);
		return ret;
	}
};

