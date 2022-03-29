 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == nullptr) {return true;}
        return BST(root, INT_MIN, INT_MAX, true, true);
    }
private:
    bool BST(TreeNode* root, int low, int high, bool infL, bool infH){
        return (root->left == nullptr || (root->left->val < root->val && (infL || root->left->val > low) && BST(root->left, low, root->val, infL, false))) &&
            (root->right == nullptr || (root->right->val > root->val && (infH || root->right->val < high) && BST(root->right, root->val, high, false, infH)));
    }
};

