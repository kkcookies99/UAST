 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)
            return true;
        if(root -> left == NULL && root -> right == NULL)
            return true;
        if(root -> left == NULL || root -> right == NULL)
            return false;
        return is_same(root -> left, root ->right);
    }
    bool is_same(TreeNode *p1, TreeNode *p2)
    {
        if(p1 == NULL && p2 == NULL)
            return true;
        if(p1 == NULL || p2 == NULL)
            return false;
        return (p1 -> val == p2 -> val) && is_same(p1 -> left, p2 -> right) && is_same(p1 -> right, p2 -> left);
    }
};

