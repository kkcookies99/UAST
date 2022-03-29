 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        vector<int> treeP;
        vector<int> treeQ;
        Reversion(p,treeP);
        Reversion(q,treeQ);
        int lenP=treeP.size();
        int lenQ=treeQ.size();
        if(lenP!=lenQ)
            return false;
        for(int i=0;i<lenP;i++)
        {
            if(treeP[i]!=treeQ[i])
                return false;
        }
        return true;
    } 

    void Reversion(TreeNode* t,vector<int>& v)
    {
        if(t==nullptr)
            return;
        if(t->left!=nullptr&&t->right!=nullptr)
        {
            v.push_back(t->val);
            Reversion(t->left,v);
            Reversion(t->right,v);
        } 
        else if(t->left==nullptr&&t->right!=nullptr)
            {
                v.push_back(t->val);
                v.push_back(-1);
                Reversion(t->right,v);
            }
        else  
        {
            v.push_back(t->val);
            Reversion(t->left,v);
            Reversion(t->right,v);
        }

    }
};

