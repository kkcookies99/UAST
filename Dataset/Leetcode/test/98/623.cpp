 class Solution {
public:
    long long nnum=-1e18;
    bool XXX(TreeNode* root) {
        if(root==NULL) return true;
        bool lefg=true,rifg=true,nfg=true;
        if(root->left!=NULL){
            lefg=XXX(root->left);
        }
        if(!lefg) return false;

        if(root->val <= nnum) nfg=false;
        if(!nfg) return false;
        nnum=root->val;

        if(root->right!=NULL){
            rifg=XXX(root->right);
        }
        if(!rifg) return false;

        return true;
    }
};

