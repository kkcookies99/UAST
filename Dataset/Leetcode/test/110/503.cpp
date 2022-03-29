class Solution {
public:
	bool XXX(TreeNode* root) {
		bool flag = true;
		adjust(root, flag);
		return flag;
	}
	int adjust(TreeNode* root, bool& flag)
	{
		if (root == NULL) return 0;
		int g1 = adjust(root->right, flag), g2 = adjust(root->left, flag);
		if (g1 - g2 > 1 || g2 - g1 > 1) flag = false;
		return max(g1, g2) + 1;
	}
};

