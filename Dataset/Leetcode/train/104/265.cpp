class Solution {
public:
	int XXX(TreeNode* root) {
		if (nullptr == root) 
			return 0;
        return max(XXX(root->left),XXX(root->right)) + 1;
	}
};

