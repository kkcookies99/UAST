int XXX(struct TreeNode* root){
    if(root==NULL)
        return 0;
    if(root->left!=NULL&&root->right==NULL)
        return XXX(root->left)+1;
    if(root->left==NULL&&root->right!=NULL)
        return XXX(root->right)+1;
    //return (XXX(root->left)<XXX(root->right)?XXX(root->left):XXX(root->right))+1;
    //用三目运算求最小的话会报错：程序运行超时
    //解决办法：调用C语言的库函数可以缩短运行时间
    return fmin(XXX(root->left),XXX(root->right))+1;
}

