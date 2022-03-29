class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        return helper(root, 0, sum);
    }
    
    bool helper(TreeNode* root, int sum, int target) {
        if(!root) return false;
        if(root->val + sum == target && !root->left && !root->right) return true;
        return helper(root->left,sum+root->val,target) || helper(root->right,sum+root->val,target);
    }
};

