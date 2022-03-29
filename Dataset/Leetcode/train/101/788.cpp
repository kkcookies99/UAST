 class Solution {
public:
    bool XXX(TreeNode* root) {
        TreeNode* root_p=root;
        return is_sym(root,root_p);
    }
    bool is_sym(TreeNode* root, TreeNode* root_p){
        if(!root&&!root_p)
            return true;
        if(!root||!root_p||root->val!=root_p->val)
            return false;
        return is_sym(root->left,root_p->right)&&is_sym(root->right,root_p->left);
    }
};

