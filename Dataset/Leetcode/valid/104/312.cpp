class Solution {
public:
    int XXX(TreeNode* root) {

	int m, n;
	if (root == NULL) return 0;
	else
	{
		m = XXX(root->left);
		n = XXX(root->right);
		if (m > n) return m + 1;
		else return n + 1;	
	}

    }
};

