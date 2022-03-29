 class Solution {
public:
	vector<int> inorderTraversal(TreeNode* root) {
		vector<int> res;
		if (!root) {
			return res;
		}
		stack<TreeNode*> st;
		st.push(root);
		while (root->left)
		{
			st.push(root->left);
			root = root->left;
		}
		while (!st.empty())
		{
			TreeNode* top = st.top();
			res.push_back(top->val);
			st.pop();
			if (top->right) {
				st.push(top->right);
				TreeNode* temp = top->right;
				while (temp->left)
				{
					st.push(temp->left);
					temp = temp->left;
				}
			}
		}
		return res;
	}
	bool XXX(TreeNode* root) {
		vector<int> ans = inorderTraversal(root);
		int n = ans.size();
		if (n == 0) {
			return true;
		}
		if (n == 1) {
			return true;
		}
		if (n >= 2) {// 1 2 3 4
			for (int i = 0; i < n - 1; i++) {
				if (ans[i] >= ans[i + 1]) {
					return false;
				}
			}
			return true;
		}
		return true;
	}
};

