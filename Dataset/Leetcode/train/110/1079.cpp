 class Solution {
public:
	int height(TreeNode *root)
	{
		if(!root)
		{
			return 0;
		}
		return	max(height(root->left),height(root->right))+1;
	}
	
   bool XXX(TreeNode* root)
   {
    	if(!root)
		{
			return true;
		}
		if(!XXX(root->left)) return false;
		if(!XXX(root->right)) return false;
		return abs(height(root->left)-height(root->right))<=1;
    }
    
};

