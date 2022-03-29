 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == nullptr) return true;
        else return helper(root->left, root->right);
    }
    bool helper(TreeNode* left, TreeNode* right)
    {
        if(left != nullptr && right != nullptr)
        {
            if(left->val != right->val) return false;
            return helper(left->left, right->right) && helper(left->right, right->left);
        }
        else if(left == nullptr && right == nullptr) return true;
        else return false;
    }
};

