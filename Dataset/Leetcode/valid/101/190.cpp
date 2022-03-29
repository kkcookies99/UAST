 class Solution {
public:
	bool XXX(TreeNode* root) {
		if (!root) return true;
		return dfs(root->left, root->right);
	}
	bool dfs(TreeNode* t1, TreeNode* t2) {
		if (!t1 && !t2) return true;
		else if (t1&&t2) {
			return t1->val == t2->val
				&&dfs(t1->left, t2->right)&&dfs(t1->right,t2->left);
		}
		else return false;
	}
};

