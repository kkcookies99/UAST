 class Solution {
public:
    TreeNode*pre=NULL;
    bool XXX(TreeNode* root) {
        if(root==NULL) return true;
        if(!XXX(root->left))
            return false;
        if(pre!=NULL && root->val<=pre->val) 
            return false;
        pre = root;
        return XXX(root->right);       
    }
};

