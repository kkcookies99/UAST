 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p != nullptr && q != nullptr) return XXX(p->left, q->left) && (p->val == q->val) && XXX(p->right, q->right);
        else if(p == nullptr && q == nullptr) return true;
        else return false;
    }
};

