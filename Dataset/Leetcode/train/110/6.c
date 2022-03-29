 int getHeight(TreeNode*root){
        if(!root) return 0;
        int d1=getHeight(root->left);
        int d2=getHeight(root->right);
        return (d1>d2)?d1+1:d2+1;
    }
    bool XXX(TreeNode* root) {
        if(!root) return true;
        if(XXX(root->left)&&XXX(root->right)){
            int leftH=getHeight(root->left);
            int rightH=getHeight(root->right);
            if(leftH-rightH>=-1&&leftH-rightH<=1) return true;
            return false;
        }
        return false;
    }

