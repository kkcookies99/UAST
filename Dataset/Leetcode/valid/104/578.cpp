class Solution {
public:
    int count ;
    int XXX(TreeNode* root) {
        //vector<vector<int>> vec;
        if (root == NULL) return 0;
        count = 1;
        root->val = 1;
        dfs(root);
        return count;
    }

    void dfs(TreeNode* root) {
        count = max(count, root->val);
        if (root->left) {
            root->left->val = root->val + 1;
            dfs(root->left);
        }
        if (root->right) {
            root->right->val = root->val + 1;
            dfs(root->right);
        }
    }
};

