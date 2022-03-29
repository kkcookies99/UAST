 class Solution {
public:
    bool check(TreeNode* r1, TreeNode* r2){
        if (r1 == NULL && r2 == NULL) return true;
        if (r2 == NULL || r2 == NULL) return false;
        if (r1->val == r2->val) 
            return check(r1->left, r2->right) && check(r1->right, r2->left);
        return false;
    }
    
    bool XXX(TreeNode* root) {
        if(!root) return true;
        return check(root, root);
    }
};

