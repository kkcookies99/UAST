bool XXX(struct TreeNode* root){
    if(dfs(root)==-1)return false;
    return true ;
}
int dfs(struct TreeNode*root)
{
    int a,b;
    if(root==NULL)return 0;
    a=dfs(root->left);
    if(a ==-1)return -1;
    b = dfs(root->right);
    if(b==-1)return -1;
    if(a-b>1||b-a>1)
    {
        return -1;
    }
    return 1+ (a>b?a:b);
}

