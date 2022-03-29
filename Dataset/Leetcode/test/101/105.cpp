 class Solution {
public:
    bool XXX(TreeNode* root) {
        if (root==nullptr) return true;
        return isSameTree(root->left,root->right);
    }
private:
    bool isSameTree(TreeNode *p, TreeNode *q)
    {
        if (p == nullptr || q == nullptr)
            return q == p;
        if (p->val != q->val)
            return false;
        return isSameTree(p->left, q->right) && isSameTree(p->right, q->left);
    }
};

