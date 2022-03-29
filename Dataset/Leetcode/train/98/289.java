 class Solution {
    TreeNode* tmp=NULL;
public:
    bool XXX(TreeNode* root) {
        if(!root)
            return true;
        bool left=XXX(root->left);
        if(tmp&&root->val<=tmp->val){
            return false;
        }
        tmp=root;
        bool right=XXX(root->right);
        return left&&right;
    }
};

