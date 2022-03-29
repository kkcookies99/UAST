 class Solution {
public:
    bool XXX(TreeNode* root) {
        return solve(root,-1e10,1e10);
    }
    
    bool solve(TreeNode* root,long long _min,long long _max){
        if(!root)return true;
        if(root->val <= _min || root->val >= _max)return false;
        return solve(root->left,_min,root->val) && solve(root->right,root->val,_max);
    }
    
};


