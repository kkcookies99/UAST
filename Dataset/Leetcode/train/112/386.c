 bool XXX(struct TreeNode* root, int targetSum){
    if(root == NULL) return false;
    targetSum -= root->val;
    if(root->left == NULL && root->right == NULL) return targetSum == 0;

    return XXX(root->left, targetSum) || XXX(root->left, targetSum);

}

