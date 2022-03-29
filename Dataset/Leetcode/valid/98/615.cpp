 class Solution {
public:
    long j=LONG_MIN;
    bool XXX(TreeNode* root) {
        if(!root) return true;
        int y=1;
        if(root->left) {
            if(root->left->val>j) {y=y&& XXX(root->left);}
            else return false;
        }
        if(root->val>j){
            j=root->val;
        }
        else return false;
        if(root->right) {
            if(root->right->val>j) {y=y&& XXX(root->right);}
            else return false;
        }
        return y;

    }
};

