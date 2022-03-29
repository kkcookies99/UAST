 class Solution {
public:
    bool XXX(TreeNode* root) {return dfs(root, INT64_MIN, INT64_MAX);}
    bool dfs(TreeNode *root, long int mi, long int ma) {
        if (root == NULL) return true;
        if (root->val <= mi || root->val >= ma)  return false;
        else return dfs(root->left, mi, root->val)&&dfs(root->right, root->val, ma);
    }
};

