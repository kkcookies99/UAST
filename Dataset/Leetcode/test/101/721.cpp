 class Solution {
public:
    bool XXX(TreeNode* root) {
        if (root == NULL) return true;
        turn(root->right);
        return issame(root->left, root->right);
    }
    void turn(TreeNode* root) {
        if (root == NULL) return;
        if (root->left == NULL && root->right == NULL) return;
        TreeNode *temp = root->left;
        root->left = root->right;
        root->right = temp;
        turn(root->left);
        turn(root->right);
    }
    bool issame(TreeNode *root1, TreeNode *root2) {
        if (root1 == NULL && root2 == NULL)  return true;
        if (root1 == NULL || root2 == NULL)  return false;
        return root1->val == root2->val && issame(root1->left, root2->left) && issame(root1->right, root2->right);
    }
};

