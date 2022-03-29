 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if (root == nullptr) {
            return false;
        }
        if (root->left == nullptr && root->right == nullptr) {
            if (sum == root->val) {
                return true;
            } else {
                return false;
            }
        } 
        if (XXX(root->left, sum - root->val)) {
            return true;
        } else {
            return XXX(root->right, sum - root->val);
        }
    }
};

