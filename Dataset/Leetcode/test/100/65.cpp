 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if (p == nullptr && q == nullptr) return true;
        else if (p == nullptr || q == nullptr){ return false; }
        
        if (p->val == q->val) {
            return XXX(p->right, q->right) && XXX(p->left, q->left);
        }       
        else {
            return false;
        }       
    }
};

