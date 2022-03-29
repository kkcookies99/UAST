 class Solution {
public:
    bool XXX(TreeNode* root) {
        //简单优雅的前序遍历
        return dfs(root,(long long)INT_MIN*2,(long long)INT_MAX*2);
    }
    bool dfs(TreeNode* root,long long mini,long long maxi){
        if(root==nullptr) return true;
        if(root->val<=mini || root->val>=maxi) return false;
        return dfs(root->left,mini,root->val) && dfs(root->right,root->val,maxi);
    }
};

