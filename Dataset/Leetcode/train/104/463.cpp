class Solution {
public:
    int XXX(TreeNode* root) {
        int res = 0, depth = 1;
        dfs(root, res, depth);
        return res;
    }

    void dfs(TreeNode* root, int& res, int depth)
    {
        if (!root)
        {
            // 因为该层节点为null，不统计，故-1
            res = max(res, depth - 1);
            return;
        }

        dfs(root->left, res, depth + 1);
        dfs(root->right, res, depth + 1);

        return;
    }
};

