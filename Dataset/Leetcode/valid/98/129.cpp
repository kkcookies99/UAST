 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == NULL) return true;
        TreeNode* p = root->left;
        TreeNode* q = root->right;
        if(!p && !q) return true;
        if(p != NULL) while(p->right != NULL) p = p->right;
        if(q != NULL) while(q->left != NULL) q = q->left;
        return (p != NULL ? root->val > p->val : 1 )
            && (q != NULL ? root->val < q->val : 1)
            && XXX(root->left) && XXX(root->right);
    }
};

