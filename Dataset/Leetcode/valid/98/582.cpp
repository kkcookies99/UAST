 class Solution {
public:
    TreeNode* pre = nullptr;
    bool XXX(TreeNode* root) {
        if(root == nullptr) return true;
        bool left = XXX(root->left);
        if(pre != nullptr){
            if(pre->val >= root->val) return false;
        }
        pre = root;
        bool right = XXX(root->right);
        return left && right;
    }
};

