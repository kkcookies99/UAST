 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)return true;
        return check(root->left,root->right);

    }
    bool check(TreeNode *left,TreeNode *right)
    {
        if((!left&&right)||(!right&&left))return false; 
        if(!left && !right)return true;
        return check(left->right,right->left)&&check(left->left,right->right)&&(left->val==right->val);
    }
};

