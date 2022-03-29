 bool XXX(struct TreeNode* root){
    if( root->left == NULL && root->right == NULL )
        return true;
    else if( root->left == NULL || root->right == NULL )
        return false;
    else
    {
        if( root->left->val == root->right->val )      // 即均有左右子树
            return XXX( root->left ) && XXX( root->right );
        else
            return false;
    }
    
}

