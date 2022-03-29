 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(!root) return false;
        if(root->val == targetSum && !root->left && !root->right) return true;
        bool l = XXX(root->left,targetSum-root->val);
        bool r = XXX(root->right,targetSum-root->val);
        return l || r;
    }
};

