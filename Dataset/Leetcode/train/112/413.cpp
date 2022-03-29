 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if (root == nullptr) return false;
        if (root->val == sum && root->left== nullptr && root->right== nullptr)
        {
            return true;
        }
        return XXX(root->left,sum-root->val) ||
                XXX(root->right,sum-root->val);
    }
};

