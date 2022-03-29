int XXX(struct TreeNode* root){
if(!root)
return 0;
else
{
    int i=0;
    int a=0,b=0;
//左子树加上本层
        a=1+XXX(root->left);
//右子树加上本层
        b=1+XXX(root->right);
//判断左子树右子树谁深
    i=a>b?a:b;
    return i;
}
}

