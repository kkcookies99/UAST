class Solution {
private:
	int maxDeep = 0;
public:
	void dfs(TreeNode* root,int level)
	{
		if (root != NULL)
		{
			level++;
			if (level > maxDeep)
			{
				maxDeep = level;
			}
		}
		else
		{
			return;
		}
		dfs(root->left,level);
		dfs(root->right, level);
	}

	int XXX(TreeNode* root) {
		dfs(root,0);
		return maxDeep;
	}
};

