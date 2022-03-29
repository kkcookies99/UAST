int XXX(struct TreeNode* root){
    if(root == NULL)
        return 0;
    int left = XXX(root->left);
    int right = XXX(root->right);
    if(root->left == NULL)
        return right + 1;
    else if(root->right == NULL)
        return left + 1;
    else return left < right ? left + 1 : right + 1;
}

