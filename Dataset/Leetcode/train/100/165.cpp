 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        stack<TreeNode*>sp,sq;
        while(true)
        {
            while(p!=NULL||q!=NULL)
            {
                if(p==NULL||q==NULL||p->val!=q->val)
                    return false;
                sp.push(p);
                sq.push(q);
                p=p->left;
                q=p->left;
            }
            if(sp.empty()&&sq.empty()) break;
            p=sp.top();
            sp.pop();
            p=p->right;
            q=sq.top();
            sq.pop();
            q=q->right;
        }
        return true;
    }
};

