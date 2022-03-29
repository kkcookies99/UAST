class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(!root) return 0;
        if(targetSum==root->val&&root->left==nullptr&&root->right==nullptr)
            return 1;
        if(root->left) if(XXX(root->left,targetSum-root->val))return 1;
        if(root->right) if(XXX(root->right,targetSum-root->val))return 1;
        return 0;
    }
};

