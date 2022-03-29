 class Solution {
public:
    bool goAlongLeftBranch(TreeNode* p,TreeNode* q,stack<TreeNode*> &s_p,stack<TreeNode*> &s_q)
    {   
        int val_of_p,val_of_q;
        while(p!=nullptr||q!=nullptr)
        {
            if(p==nullptr||q==nullptr) return false;//保证结构相同
            val_of_p=p->val;
            val_of_q=q->val;
            if(val_of_p!=val_of_q) return false;//保证数值相同
            s_p.push(p->right);
            s_q.push(q->right);
            p=p->left;
            q=q->left;
        }
        return true;
    }
    bool XXX(TreeNode* p, TreeNode* q) {
        stack<TreeNode*> s_p;
        stack<TreeNode*> s_q;
        bool ok=true;
        while(1)
        {
            ok=goAlongLeftBranch(p,q,s_p,s_q);
            if(!ok) return false;
            if(s_p.empty()&&s_q.empty()) break;
//            else if(s_p.empty()||s_q.empty()) return false;
            p=s_p.top();s_p.pop();
            q=s_q.top();s_q.pop();
        }
        return ok;
    }
};

