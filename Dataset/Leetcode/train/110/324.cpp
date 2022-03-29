class Solution {
public:
    int depth(TreeNode* node) {
		
		int left_depth = 0;
		int right_depth = 0;

		if(node->left)
			left_depth = depth(node->left);
		
		if (node->right)
			right_depth = depth(node->right);

		if (left_depth == -1 || right_depth == -1) return -1;

		if (abs(left_depth - right_depth) > 1) return -1;

		return left_depth > right_depth ? 1 + left_depth : 1 + right_depth;
	}


	bool XXX(TreeNode* root) {
		return !root || depth(root) != -1;
	}
};

