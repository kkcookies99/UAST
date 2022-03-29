class Solution {
public:
    void helper(TreeNode* root, int depth, int& res) {
        if (root == nullptr)
            return;
        depth += 1;
        res = max(res, depth);
        helper(root->left, depth, res);
        helper(root->right, depth, res);
    }
    int XXX(TreeNode* root) {
        int res = 0;
        helper(root, 0, res);
        return res;
    }
};

