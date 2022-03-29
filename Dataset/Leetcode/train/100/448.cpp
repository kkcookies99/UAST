 class Solution {
public:
    //递归
    bool XXX(TreeNode* p, TreeNode* q) {
        if (p == nullptr && q == nullptr)
            return true;
        else if (p != nullptr && q != nullptr) {
            if (p->val != q->val) return false;
            if (XXX(p->left, q->left) && XXX(p->right, q->right))
                return true;
            else
                return false;
        } else {
            return false;
        }
    }
};

