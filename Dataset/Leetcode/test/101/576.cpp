 class Solution {
public:

    bool isSameTree(TreeNode* p, TreeNode* q) {
        if (p == nullptr && q == nullptr) {
            return true;
        } else if (p == nullptr && q != nullptr) {
            return false;
        } else if (p != nullptr && q == nullptr) {
            return false;
        } else {
            return (p->val == q->val) && isSameTree(p->left, q->right) && isSameTree(p->right, q->left);
        }
    }

    bool XXX(TreeNode* root) {
        if (root == nullptr) {
            return true;
        } else {
            return isSameTree(root->left, root->right);
        }
    }
};

