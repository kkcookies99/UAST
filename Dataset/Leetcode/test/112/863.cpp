 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(!root) return false;
        if(root->val==sum&&(!root->left)&&!(root->right)) return true;
        return XXX(root->left,sum-root->val)||XXX(root->right,sum-root->val);
    }
};

