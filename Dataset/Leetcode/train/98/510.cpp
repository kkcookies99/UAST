 class Solution {
public:
    bool XXX(TreeNode* root, long long lower, long long upper){
        if(!root)
            return true;
        else if(root->val > lower && root->val < upper){
            return XXX(root->left, lower, root->val) && XXX(root->right, root->val, upper);
        }
        else    
            return false;
    }
    bool XXX(TreeNode* root) {
        return XXX(root, 0x8000000000000000, 0x7FFFFFFFFFFFFFFF);
    }   
};

