int XXX(struct TreeNode* root){
    if(root==0){
        return 0;
    }
    int left = XXX(root->left);
    int right = XXX(root->right);
    return (left>right?left:right)+1;
}

