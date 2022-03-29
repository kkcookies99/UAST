 class Solution {
public:
    long MIN = LONG_MIN;
    bool XXX(TreeNode* root) {
        if(root == nullptr) return true;
        bool left = XXX(root->left);
        if(!(MIN<root->val)) return false;
        MIN = root->val;
        bool right = XXX(root->right);
        return right&&left;
    }
};

