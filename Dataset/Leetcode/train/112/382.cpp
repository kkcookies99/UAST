 class Solution {
public:
    bool helper(TreeNode* root, int val, int targetSum) {
        if (root == nullptr)
            return false;;
        val += root->val;
        if (val == targetSum && root->left == nullptr && root->right == nullptr)
            return true;
        else {
            if (helper(root->left, val, targetSum))
                return true;
            if (helper(root->right, val, targetSum))
                return true;
        } 
        return false;  
    }
    bool XXX(TreeNode* root, int targetSum) {
        return helper(root, 0, targetSum);
    }
};

