class Solution {
public:
    bool XXX(TreeNode* root) {
        if (root == NULL) return true;
        if (XXX(root -> left) && XXX(root -> right) && (abs(dep(root -> left) - dep(root -> right)) <= 1))
            return true;
        else 
            return false;
    }
    int dep(TreeNode *root) {
        if (root == NULL)
            return 0;
        return max(dep(root -> left), dep(root -> right)) + 1;
    }
};

