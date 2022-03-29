 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(root==nullptr)     return false;
        if(root->val==targetSum&&!root->left&&!root->right) return true;
        return XXX(root->left,targetSum-root->val)||XXX(root->right,targetSum-root->val);

    }
};

