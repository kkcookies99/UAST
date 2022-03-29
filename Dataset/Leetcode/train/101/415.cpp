 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)
            return true;
        return isEqual(root->left, root->right);
    }
    bool isEqual(TreeNode* rleft, TreeNode* rright)
    {
        if(!rleft && !rright)
            return true;
        if(rleft && rright)
            return rleft->val == rright->val && isEqual(rleft->left, rright->right) && isEqual(rleft->right, rright->left);
        return false;            
    }
};

