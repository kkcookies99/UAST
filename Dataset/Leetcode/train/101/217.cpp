 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root) return true;
        return XXXCore(root->left, root->right);
    }
    bool XXXCore(TreeNode* root, TreeNode* root2){
        bool res;
        if(!root && !root2) return true;
        if(!root || !root2) return false;
        res = root->val == root2->val;
        res = res && XXXCore(root->left, root2->right);
        res = res && XXXCore(root2->left, root->right);
        return res;
    }
};

