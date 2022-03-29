 class Solution {
public:
    bool Symmetric(TreeNode* p, TreeNode* q)
    {
        if (p == q) return true;
        return (p && q && p->val == q->val) && 
            Symmetric(p->left, q->right) && 
            Symmetric(p->right, q->left);
    }

    bool XXX(TreeNode* root) {
        return !root || Symmetric(root->left, root->right);
    }
};

