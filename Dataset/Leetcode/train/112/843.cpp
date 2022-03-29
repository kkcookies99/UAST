 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root==NULL) return false;
		if(root->left==NULL&&root->right==NULL&&root->val==sum) return true;
		// return XXX(root->left,sum-root->val)||XXX(root->right,sum-root->val);
        bool l=XXX(root->left,sum-root->val);
        bool r=XXX(root->right,sum-root->val);
        return l||r;
		
    }
};

