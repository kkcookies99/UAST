 class Solution {
public:
    TreeNode* pre = nullptr;
    bool isValid = true;
    void Dfs(TreeNode* root) {
        if (root == nullptr) return;
        Dfs(root->left);
        if (pre == nullptr) {
            pre = root;
        } else {
            if (pre->val >= root->val) {
                isValid = false;
                return;
            }
            pre = root;
        }
        Dfs(root->right);
    }
    bool XXX(TreeNode* root) {
        Dfs(root);  
        return isValid;
    }
};

