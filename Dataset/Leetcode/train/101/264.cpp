 class Solution {
public:
    bool XXX(TreeNode* root) {
        function<bool(TreeNode*, TreeNode*)>dfs = [&](TreeNode *n1, TreeNode *n2){
            if (n1 == NULL && n2 == NULL){
                return true;
            }
            if ((n1 == NULL && n2 != NULL) || (n1 != NULL && n2 == NULL)){
                return false;
            }
            return (bool)(n1->val == n2->val) && dfs(n1->left, n2->right) && dfs(n1->right, n2->left);
        };
        return dfs(root, root);
    }
};

