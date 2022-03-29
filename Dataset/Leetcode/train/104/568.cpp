class Solution {
public:
    int XXX(TreeNode* root) {
        if (!root) {
            return 0;
        }
        int left = this->XXX(root->left);
        int right = this->XXX(root->right);
        return (left > right) ? left + 1 : right + 1;
    }
};

