class Solution {
public:
    int res = 0;
    int XXX(TreeNode* root) {
        dfs(root, 1);
        return res;
    }
    void dfs(TreeNode* node, int layer) {
        if(node == nullptr) return ;
        res = max(res, layer);
        if(node->left) dfs(node->left, layer + 1);
        if(node->right) dfs(node->right, layer + 1);
    }
};

