class Solution {
public:
    bool res = true;
    bool XXX(TreeNode* root) {
        if (root == nullptr) return true;
        dfs(root);
        return res;
    }

    int dfs(TreeNode* n) {
        if (n == nullptr) return 0;
        int a = dfs(n->left);
        int b = dfs(n->right);

        if (!res) return 0;
        res = abs(a - b) <= 1;

        return max(a, b) + 1;
    }
};

