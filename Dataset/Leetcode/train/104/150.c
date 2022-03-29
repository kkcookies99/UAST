int XXX(struct TreeNode* root){
	if(root == NULL)
    	return 0;
    return fmax(XXX(root->left) + 1, XXX(root->right) + 1);
}

