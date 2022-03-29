 class Solution {
public:
    int last = -1234567;
    bool XXX(TreeNode* root) {
        return inorder(root);
    }

    bool inorder(TreeNode* root) {
        if (root == NULL) return true;
        bool left = inorder(root->left);
        if (!left) return false;
        if (last == -1234567) {
            last = root->val;
        }
        else if (last >= root->val) {
            return false;
        }
        else {
            last = root->val;
        }
        return inorder(root->right);
    }
};

