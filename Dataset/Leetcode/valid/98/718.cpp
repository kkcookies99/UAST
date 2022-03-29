 class Solution {
public:
    bool XXX(TreeNode* root) {
        TreeNode *pre = nullptr;
        return inorder(root, pre);
    }

    bool inorder(TreeNode* node, TreeNode* &pre) {
        if (node == nullptr) {
            return true;
        }
        bool l = inorder(node->left, pre);
        if (!l) {
            return false;
        }

        if (pre != nullptr && pre->val >= node->val) {
            return false;
        }
        pre = node;
        return inorder(node->right, pre);
    }
};

