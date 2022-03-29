int XXX(struct TreeNode* root){
    return root ? fmax(XXX(root->left),XXX(root->right)) + 1 : 0;
}

