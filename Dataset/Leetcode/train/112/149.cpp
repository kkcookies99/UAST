class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(!root) return false ;
        if(!root -> left && !root -> right) return root->val == targetSum ;
        if(root -> left && XXX(root->left , targetSum - root -> val)) return true ;
        if(root -> right && XXX(root -> right ,targetSum - root -> val)) return true ;
        return false ;
    }
};

