 class Solution {
public:
    bool XXX(TreeNode* root, long long min = LONG_LONG_MIN, long long max = LONG_LONG_MAX) {
        if(root == NULL)  return true;
        if(root->val <= min || root->val >= max)      return false;
        
        return XXX(root->left, min, root->val) && XXX(root->right, root->val, max);
    }
};

