 class Solution {
public:

    bool recur(TreeNode* left_root, TreeNode* right_root){
        if (left_root == nullptr && right_root == nullptr)
            return true;
        if ((left_root == nullptr && right_root != nullptr) || 
            (left_root != nullptr && right_root == nullptr) ||
            (left_root->val != right_root->val))
            return false;
        bool in = recur(left_root->left, right_root->right);
        bool out = recur(left_root->right, right_root->left);
        return in && out;
    }

    bool XXX(TreeNode* root) {
        return recur(root->left, root->right);
    }
};

