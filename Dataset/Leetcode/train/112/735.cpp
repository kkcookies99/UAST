 class Solution {
public:
    bool final=false;
    void dfs(TreeNode *root,int sum)
    {
        if(root==NULL||final==true)return;
        if(root->left==NULL&&root->right==NULL&&root->val==sum)
        {
            final=true;
            return;
        }
        dfs(root->left,sum-root->val);
        dfs(root->right,sum-root->val);    
    }
    bool XXX(TreeNode* root, int sum) {
        dfs(root,sum);
        return final;
    }
};

