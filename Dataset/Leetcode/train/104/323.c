int XXX(struct TreeNode* root){
    if( root == NULL ) return 0;
    int left = XXX(root->left);
    int right = XXX(root->right);
    return left > right ? left + 1 : right + 1;
}

