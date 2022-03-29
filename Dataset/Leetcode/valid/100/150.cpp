 class Solution {
public:
//2021.9.26
    bool XXX(TreeNode* p, TreeNode* q) 
    {
        if(!p && q)
            return false;
        if(p && !q)
            return false;
        if(!p && !q)
            return true;
        if(p->val != q->val)//本来我写的是相等返回true 但显然不应该这样,只有遍历完整颗树没有不等的才返回true,不能当前节点相等就返回true
            return false;
            
        return XXX(p->left,q->left) && XXX(p->right,q->right);
    }  
};

