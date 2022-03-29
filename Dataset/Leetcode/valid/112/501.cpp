 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(nullptr==root) return false;
        if(nullptr != root->left && XXX(root->left, sum-root->val)) return true;
        if(nullptr != root->right && XXX(root->right, sum-root->val)) return true; 
        if(sum == root->val && nullptr==root->left && nullptr==root->right) return true;    
        else return false;    
    }
};

