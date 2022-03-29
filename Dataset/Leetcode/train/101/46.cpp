 class Solution {
public:
    bool XXX(TreeNode* left, TreeNode* right) {
        if (left == nullptr && right == nullptr) return true;
        if ((left == nullptr && right != nullptr) || (left != nullptr && right == nullptr)) return false;     
        if (left->val != right->val) return false;        
        return XXX(left->left, right->right) && XXX(left->right, right->left);;
    }


    bool XXX(TreeNode* root) {
        return XXX(root->left, root->right);
    }
};

