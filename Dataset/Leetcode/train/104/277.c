int XXX(struct TreeNode* root){
    int left, right;

    if (root == NULL) { return 0; }
    
    left = 1 + XXX(root->left);
    right = 1 + XXX(root->right);

    if (left >= right) {
        return left;
    } else {
        return right;
    }
}

