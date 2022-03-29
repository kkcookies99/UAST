 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        return helper(root, 0, targetSum);
    }
    bool helper(TreeNode* root, int buf, int targetSum)
    {
        if(root == nullptr) return false;
        else if(root->left == nullptr && root->right == nullptr)
        {
            buf += root->val;
            if(buf == targetSum) return true;
            else return false;
        }
        else if(root->left != nullptr && root->right == nullptr)
            return helper(root->left, buf + root->val, targetSum);
        else if(root->left == nullptr && root->right != nullptr)
            return helper(root->right, buf + root->val, targetSum);
        else return helper(root->left, buf + root->val, targetSum) || helper(root->right, buf + root->val, targetSum);
    }
};

