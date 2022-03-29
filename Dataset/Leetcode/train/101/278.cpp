 class Solution {
public:
    bool XXX(TreeNode* n1,TreeNode* n2){
        if(n1==nullptr && n2==nullptr) return true;
        if(n1==nullptr || n2==nullptr) return false;
        return n1->val==n2->val
            &&XXX(n1->right,n2->left)
            &&XXX(n1->left,n2->right);
    }
    bool XXX(TreeNode* root) {
        return XXX(root->left,root->right);
    }
};

