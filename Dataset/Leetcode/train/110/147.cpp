class Solution {
public:
    bool res = true;
    bool XXX(TreeNode* root) {
        if(root == nullptr) return res;
        f(root);
        return res;
    }
    void f(TreeNode* root) {
        if(root->left) dfs1(root->left, 1);
        if(root->right) dfs2(root->right, 1);
        if(abs(l - r) > 1) res = false;
        l = 0, r = 0;
        if(root->left) f(root->left);
        if(root->right) f(root->right);
    }
    int l = 0, r = 0;
    void dfs1(TreeNode* root, int ht) {
        l = max(l, ht);
        if(root->left) dfs1(root->left, ht + 1);
        if(root->right) dfs1(root->right, ht + 1);
    }
    void dfs2(TreeNode* root, int ht) {
        r = max(r, ht);
        if(root->left) dfs2(root->left, ht + 1);
        if(root->right) dfs2(root->right, ht + 1);
    }
};

