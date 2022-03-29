 class Solution {
public:
    bool res=false;
    
    bool _isSame(TreeNode* p, TreeNode* q){
        if(p==nullptr&&q==nullptr)
            return true;
        if(p==nullptr||q==nullptr)
            return false;
        if(p->val!=q->val)
            return false;
        if(_isSame(p->left,q->left)==false)
            return false;
        if(_isSame(p->right,q->right)==false)
            return false;
        
        return true;
    }
    
    bool XXX(TreeNode* p, TreeNode* q) {
        res=_isSame(p,q);
        return res;
    }
};

