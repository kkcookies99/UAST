int XXX(struct TreeNode* root){
    if(root==NULL) return 0;
    int depL = XXX(root->left)+1;
    int depR = XXX(root->right)+1;
    int dep = depL>depR ? depL:depR;
    return dep;
}

