 class Solution {
public:
    void dfs(TreeNode* root, int & sum,int tmpsum)
    {
        if(root==nullptr)
            return;
        if(!root->left && !root->right && tmpsum+root->val==sum)
            flag=true;
        dfs(root->left,sum,tmpsum+root->val);
        dfs(root->right,sum,tmpsum+root->val);
    }
    bool XXX(TreeNode* root, int sum) {
        if(root==nullptr)
            return false;
        flag=false;
        dfs(root,sum,0);
        return flag;
    }
private:
    bool flag;
};

