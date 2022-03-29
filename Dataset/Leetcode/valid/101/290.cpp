 class Solution {
public:
    bool XXX(TreeNode* root) {
        return XXXFun(root,root);
    }
private:
    bool XXXFun(TreeNode *l1,TreeNode *l2)
    {
        if(!l2 && !l1) return true;
        if(!l1 || !l2) return false;
        if(l1->val == l2->val)
        {
            return XXXFun(l1->left,l2->right) && XXXFun(l1->right,l2->left);
        }
        return false;
    }
};

