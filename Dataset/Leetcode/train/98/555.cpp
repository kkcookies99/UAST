 class Solution {
public:
    vector<long long> num;
    int len=0;
    void dfs(TreeNode* root) 
    {
        if(root==nullptr)
        return ;
        dfs(root->left);
        ++len;
        num.push_back(root->val);
        dfs(root->right);
        
    }
    bool XXX(TreeNode* root) 
    {
        dfs(root);
        for(int i=1;i<len;++i)
            if(num[i]<=num[i-1])
            return false;
        return true;
        
    }
};

