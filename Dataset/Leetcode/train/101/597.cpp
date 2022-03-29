 class Solution {
public:
    bool _XXX(TreeNode* t1, TreeNode* t2) {
        if ( !t1 && !t2 )
            return true;

        if ( t1 && t2 ) {
            return t1->val == t2->val && _XXX(t1->left, t2->right) 
                && _XXX(t1->right, t2->left);
        }

        return false;
    }
    bool XXX(TreeNode* root) {
        if ( !root )
            return true;
        
        return _XXX(root->left, root->right);
    }
};

