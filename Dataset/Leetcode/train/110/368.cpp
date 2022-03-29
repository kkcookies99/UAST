class Solution {
public:
	bool XXX(TreeNode* root) {
		if (root == nullptr) {
			return true;
		}
		if (root->left == nullptr&&root->right == nullptr) {
			return true;
		}
		int left = height(root->left);
		int right = height(root->right);
		return abs(left-right)<=1 && XXX(root->left) &&XXX(root->right);
	}
	int height(TreeNode* root) {
		if (root == nullptr) {
			return 0;
		}
		if (root->left == nullptr&&root->right == nullptr) {
			return 1;
		}
		int left = height(root->left);
		int right = height(root->right);
		int h = left > right ? left : right;
		return h + 1;
	}
};

