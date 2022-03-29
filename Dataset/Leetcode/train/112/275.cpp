 class Solution {
public:
    bool dfs(TreeNode *cur,int tar,int sum){
        if(!cur->left && !cur->right) return tar == sum;
        bool ans = 0;
        if(cur->left) ans |= dfs(cur->left,tar,sum + cur->left->val);
        if(cur->right) ans |= dfs(cur->right,tar,sum + cur->right->val);
        return ans;
    }
    bool XXX(TreeNode* root, int targetSum) {
        if(!root) return 0;
        return dfs(root,targetSum,root->val);
    }
};

