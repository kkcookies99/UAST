 class Solution {
public:
    bool XXX(TreeNode* root) {
        return !root || (root && isRecursionSymmetric(root->left, root->right));
    }
    bool isRecursionSymmetric(TreeNode *p, TreeNode *q){
        return (!p && !q) ||
            (p && q && p->val == q->val && 
             isRecursionSymmetric(p->left, q->right) &&
             isRecursionSymmetric(p->right, q->left));
    }
};

