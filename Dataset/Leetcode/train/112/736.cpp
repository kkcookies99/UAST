 class Solution {
public:
    void dfs(TreeNode* t,int s,int sum,int& flag) {
        if(flag==1)
            return ;
        if(t->left)
            dfs(t->left,s+t->left->val,sum,flag);
        if(t->right)
            dfs(t->right,s+t->right->val,sum,flag);
        if(!t->left&&!t->right) {
            if(s==sum) {
                flag=1;
                return ;
            }
        }
    }
    bool XXX(TreeNode* root, int sum) {
        if(!root)
            return false;
        int flag=0;
        dfs(root,root->val,sum,flag);
        if(flag==1)
            return true;
        return false;
    }
};

