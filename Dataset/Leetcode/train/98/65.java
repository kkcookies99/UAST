 class Solution {
    long pre=LONG_MIN;
public:
    bool XXX(TreeNode* root) {
        if(!root)return true;
        if(!XXX(root->left)||root->val<=pre)return false;
        pre=root->val;
        return XXX(root->right);
    }
};

