 class Solution {
public:
    long long last = -1e10;
    bool XXX(TreeNode* root) {
        if (root)
        {
            if (!XXX(root->left)) return false;
            if (root->val <= last) return false;
            last = root->val;
            if (!XXX(root->right)) return false;
        }
        return true;
    }
};

