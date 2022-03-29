 class Solution {
public:
    bool res = true;
    bool XXX(TreeNode* root) {
        if (!root) return res;
        dfs(root->left, root->right);
        return res;
    }

    void dfs(TreeNode* node1, TreeNode* node2) {
        if (!node1 && !node2) return;
        if ((!node1 && node2) || (node1 && !node2)) {
            res = false;
            return;
        }
        if (node1->val != node2->val) {
            res = false;
            return;
        }
        dfs(node1->left, node2->right);
        dfs(node1->right, node2->left);
    }
};

