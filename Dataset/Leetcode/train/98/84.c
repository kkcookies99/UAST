 bool XXX(struct TreeNode* root){
    if(!root || (!root->left&&!root->right)) return 1;
    struct TreeNode *lmax,*rmin;
    rmin=root->right;
    
        while(rmin&&rmin->left) rmin=rmin->left;
        lmax=root->left;
        while(lmax&&lmax->right)lmax=lmax->right;
    if(!root->left){
        return XXX(root->right) &&rmin->val>root->val;
        }
    if(!root->right){
        return XXX(root->left)&&lmax->val<root->val;
    }
    if(lmax->val<root->val && root->val<rmin->val && XXX(root->left) && XXX(root->right)) return 1;
    return 0;
}

