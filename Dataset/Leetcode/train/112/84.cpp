class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(!root) return false;
        else if(!root->left&&!root->right&&root->val==sum) return true;
        return XXX(root->left,sum-root->val)||XXX(root->right,sum-root->val);
    }
};

