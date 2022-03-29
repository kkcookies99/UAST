int XXX(struct TreeNode* root){
    if(root == NULL) return 0;
	if(root->left == NULL && root->right == NULL) return 1;
	if(root->left == NULL || root->right == NULL)
		return XXX(root->left ? root->left : root->right) + 1;
	if(XXX(root->left) >= XXX(root->right))
		return XXX(root->right) + 1;
	else
		return XXX(root->left) + 1;
}

