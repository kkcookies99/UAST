int** XXX(struct TreeNode* root, int* returnSize, int** returnColumnSizes){
    if(!root)
        return &returnSize;
    struct TreeNode* tree[100] = {0};
    int in = 0, out = 0;
    tree[in++] = root;
    while(in > out )
    {
        printf("%d ", tree[out]->val);
        if(tree[out]->left != NULL)
            tree[in++] = tree[out]->left;
        if(tree[out]->right != NULL)
            tree[in++] = tree[out]->right;
        out++;
    } 
    return &returnSize;    
}

