int XXX(struct TreeNode* root){
    if(root==NULL)return 0;
    int left=XXX(root->left);
    int right=XXX(root->right);
    int max=left>right?left:right;
    max+=1;
    return max;
}

