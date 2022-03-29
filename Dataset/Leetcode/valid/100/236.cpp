 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {

        if(p&&q&&p->val==q->val)
        {
            if(XXX(p->left,q->left)&&XXX(q->right,p->right))
                return true;
        }
        else if(!p&&!q)
            return true;
        return false;
    }
};

