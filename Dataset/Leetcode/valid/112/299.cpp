 class Solution {
public:
	bool XXX(TreeNode* root, int targetSum) {
		return DFS(root, 0, targetSum);
	}
	bool DFS(TreeNode* root, int cur, int &target) {
		if (nullptr == root) {
			return false;
		}
		cur += root->val;
		if (!root->left && !root->right && target == cur) {
			return true;
		}
		return DFS(root->left, cur, target) || DFS(root->right, cur, target);
		
	}
};

