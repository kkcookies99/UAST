 class Solution {
public:
    bool XXX(TreeNode* root) {
        TreeNode* pre = nullptr;
        return order(root, pre);
    }

    bool order(TreeNode* root,TreeNode* pre) {
        if(root == nullptr) {
            return true;
        }

        if (!order(root->left,pre)) {
            return false;
        }
        if(pre && pre->val >= root->val) {
            return false;
        }         
        pre = root;

        if (!order(root->right,pre)) {
            return false;
        }
        return true;
    }
};


