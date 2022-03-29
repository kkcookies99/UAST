 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == nullptr) return true;
        return check(root->left,root->right) ;
    }
    bool check(TreeNode* a,TreeNode* b){
        if(!a && !b) return true;
        if(!a && b) return false;
        if(a && !b) return false;
        return a->val == b->val && check(a->left,b->right) && check(a->right,b->left);
    }
};

