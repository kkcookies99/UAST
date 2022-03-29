 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == NULL || (root->left == NULL && root->right == NULL))
            return true;
            //helper比较的是两个子树是否对称.
        return helper(root->left, root->right);
        
    }
private:
    bool helper(TreeNode* left, TreeNode* right){
        if(left == NULL && right == NULL)
            return true;
        if(left == NULL || right == NULL)
            return false;
        //两颗子树，需要满足子树1的右孩子与子树2的左孩子，子树1的左孩子与子树2的右孩子相等
        return left->val == right->val && helper(left->right, right->left) && helper(left->left, right->right);

    }
};

