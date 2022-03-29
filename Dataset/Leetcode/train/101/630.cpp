 class Solution {
public:
    bool checkTwoTreeIsSame(TreeNode *leftTree, TreeNode *rightTree)
    {
        if(leftTree == nullptr && rightTree == nullptr) {
            return true;
        } else if (leftTree == nullptr && rightTree != nullptr) {
             return false;
        } else if (leftTree != nullptr && rightTree == nullptr) {
             return false;
        }

        if (leftTree->val != rightTree->val) {
            return false;
        } 
        return checkTwoTreeIsSame(leftTree->right, rightTree->left) && checkTwoTreeIsSame(leftTree->left, rightTree->right);
    }
    bool XXX(TreeNode *root) {
        if(root == nullptr) {
            return true;
        } 
        return checkTwoTreeIsSame(root, root);
    }
};

