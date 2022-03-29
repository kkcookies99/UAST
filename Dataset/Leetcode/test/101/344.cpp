 class Solution {
public:
    bool is(TreeNode* rl,TreeNode* rr){
        if(!rl && !rr) return true;
        if(!rl || !rr) return false;
        if(rl->val != rr ->val) return false;
        return (is(rl -> left,rr->right) && is(rl ->right,rr->left));
    }
    bool XXX(TreeNode* root) {
         return is(root ->left,root->right);
    }
};

