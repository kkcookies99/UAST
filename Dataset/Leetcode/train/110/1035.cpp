 class Solution {
public:
	bool XXX(TreeNode* root) {
		return Rec(root) != -1;
	}

	int Rec(TreeNode * T) {
		if (!T) {
			return 0;
		}

		int left = Rec(T->left);
		int right = Rec(T->right);

		if (left == -1 || right == -1 || abs(left - right) > 0) {
			return -1;
		}
		return max(left, right) + 1;
	}
};

