 class Solution {
public:
    long pre=LONG_MIN;
    bool XXX(TreeNode* root) {
        if(!root) return true;
        if(XXX(root->left)) return true;
        if(root->val<=pre) return false;
            pre=root->val;
        return XXX(root->right);
    }
};

