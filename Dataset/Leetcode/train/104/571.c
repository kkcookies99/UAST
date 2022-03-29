int XXX(struct TreeNode* root){
    if (!root) {
        return 0;
    }
    return fmax(XXX(root->left), XXX(root->right)) + 1;
}



