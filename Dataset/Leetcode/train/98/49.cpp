 class Solution {
public:
    bool XXX(TreeNode* root) {
        
        return isValid(root, INT_MAX, INT_MIN);
    }

    bool isValid(TreeNode* root, const int& maxVal, const int& minVal) {
        if (!root) {
            return true;
        }
        if (!(root->val < maxVal && root->val > minVal)) {
            return false;
        }
        return isValid(root->left, root->val, minVal)
                && isValid(root->right, maxVal, root->val);
    }
};

