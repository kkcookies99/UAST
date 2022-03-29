 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if (p!= nullptr && q != nullptr) {
            if(p->val == q->val) {
                return XXX(p->left, q->left) && XXX(p->right, q->right);
            } else{
                return false;
            }
        } else {
            return p == q;
        }
    }
};

