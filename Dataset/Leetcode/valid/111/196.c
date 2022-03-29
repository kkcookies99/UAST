int XXX(struct TreeNode* root){
if(!root) return 0;
if(!root->left && !root->right)return 1;
int l=XXX(root->left);
int r=XXX(root->right);
if(l==0) return 1+r;
if(r==0) return 1+l;
return l<r?1+l:1+r;
}

