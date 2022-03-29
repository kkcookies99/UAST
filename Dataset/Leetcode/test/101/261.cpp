 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)
            return true;
        return XXXFun(root->right, root->left);
    }

    //判断两棵树是否对称
    bool XXXFun(TreeNode* p, TreeNode* q) {
        if(!p && !q)
            return true;
        if(!!p != !!q || p->val != q->val)
            return false;
        
        if(!XXXFun(p->right, q->left) || !XXXFun(p->left, q->right))
            return false;

        return true;
    }
    
    //判断两棵树是否相同
    bool isSameTree(TreeNode* p, TreeNode* q) {
        if(!p && !q)
            return true;
        if(!!p != !!q || p->val != q->val)
            return false;
        
        if(!isSameTree(p->right, q->right) || !isSameTree(p->left, q->left))
            return false;

        return true;
    }
};

