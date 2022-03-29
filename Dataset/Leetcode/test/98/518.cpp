 class Solution {
public:
    long last = LONG_MIN;
    bool XXX(TreeNode* root) {
        if(!root) return true;
        if(XXX(root->left)) {
            if(root->val > last) last = root->val;
            else return false;
            return XXX(root->right);
        }
        return false;
    }
};

