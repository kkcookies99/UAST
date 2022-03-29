 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root){
            return is_equal(root->left,root->right);
        }
        return true;      
    }

    bool is_equal(TreeNode* l,TreeNode* r){
        if((l==nullptr && r) || (l && r==nullptr)){
            return false;
        }
        if(l==nullptr && r==nullptr){
            return true;
        }
        if(l->val==r->val){
            return is_equal(l->left,r->right) && is_equal(l->right,r->left);
        }
        return false;
    }
};

