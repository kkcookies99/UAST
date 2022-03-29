int XXX(struct TreeNode* root){
    if(root == NULL) return 0;
    if(root->left == NULL && root->right == NULL) return 1;
    if(root->left == NULL) return XXX(root->right)+1;
    if(root->right == NULL) return XXX(root->left)+1;
    int left = XXX(root->left);
    int right = XXX(root->right);
    return left < right?left+1:right+1;
}

