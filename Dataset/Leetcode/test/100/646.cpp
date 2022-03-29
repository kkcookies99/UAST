 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p && q && p->val == q->val){
            return (XXX(p->left, q->left) && XXX(p->right, q->right));
        } 
        else if(!p && !q) return true;
        else return false;
    }
};

