class Solution {

public:
	//解空间集合
	vector<int> x;
	//数据空间
	vector<int> nums;
	//节点深度；
	int n;
	//所有解的可能性
	vector<vector<int>> result;
public:

	bool IsJudge(int index) {

		if (x.size() == 0) return true;
		for (int i = 0; i < x.size(); ++i) {
			if (x[i] == index) {
				return false;
			}
		}
		return true;
	}

	void DFS(int t) {
		//说明已经到达树的根部，保存解
		if (t == n) {
			result.push_back(x);
			//返回到上一级
			return;
		}
		//每一个节点的分支均为3个
		for (int i = 0; i < n; ++i) {

			//如果每一个节点的分支均为3个意味着有大量个重复，所以排除掉存在的值，也就是剪枝；
			if (IsJudge(nums[i])) {
				x.push_back(nums[i]);
				DFS(t + 1);
				x.pop_back();
			}
			
		}

	}
	vector<vector<int>> XXX(vector<int>& nums) {
		this->n = nums.size();
		this->nums = nums;
		//从根结点开始
		DFS(0);
		return result;
	}
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


