class Solution {
public:
    void helper(TreeNode* root, int depth, int& res) {
        if (root == nullptr || depth >= res)
            return;
        depth += 1;
        if (root->left == nullptr && root->right == nullptr) {
            res = min(res, depth);
            return;
        } else {
            if (root->left != nullptr)
                helper(root->left, depth, res);
            if (root->right != nullptr)
                helper(root->right, depth, res);
        }
    }
    int XXX(TreeNode* root) {
        if (root == nullptr)
            return 0;
        int res = INT_MAX;
        helper(root, 0, res);
        return res;
    }
};

