 class Solution {
public:
    bool XXX(TreeNode* root) {
        if (root == NULL) 
            return true;
        
        return isSameTree(root -> left, root -> right);
    }

    bool isSameTree(TreeNode* p, TreeNode* q) {
        // 判断左右子树是否相同
        if (p == NULL && q == NULL)
            return true;
        
        if (p != NULL && q != NULL && p -> val == q -> val)
            return isSameTree(p -> left, q -> right) && isSameTree(p -> right, q -> left);
        
        else
            return false;
    }
};

