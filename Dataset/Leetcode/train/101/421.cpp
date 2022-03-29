 class Solution {
public:
    bool _isSameSy(TreeNode *a, TreeNode *b) {
        if(a==NULL && b==NULL) return true;
        else if (a==NULL || b==NULL) return false;
        if (a->val != b->val) return false;
        else return _isSameSy(a->left, b->right) && 
                        _isSameSy(a->right, b->left);
    }
    bool XXX(TreeNode* root) {
        if (root == NULL) return true;
        return _isSameSy(root->left, root->right);
    }
};

