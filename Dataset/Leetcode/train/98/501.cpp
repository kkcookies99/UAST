 class Solution {
public:
    bool helper(TreeNode* node, long long min, long long max) {
        if(!node) return true; 
        
        if(node->val >= max) return false;
        if(node->val <= min) return false;
        
        return helper(node->left, min, node->val) &&  helper(node->right, node->val, max);
    }
    
    bool XXX(TreeNode* root) {
        if(!root) return true;
        return helper(root, LLONG_MIN, LLONG_MAX);
    }
};

