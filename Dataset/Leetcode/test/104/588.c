int XXX(struct TreeNode* root){
    if(root==NULL){return 0;}
    return 1+Max(XXX(root->left),XXX(root->right));    
}

