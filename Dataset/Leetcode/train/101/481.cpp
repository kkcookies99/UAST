 class Solution {
public:
    bool XXX(TreeNode* root) 
    {
        if(!root)
        {
            return true;
        }
        vector<pair<int,int>>v;
        vector<int>d;
        midorder(root,0,v);
        for(int i=0,j=v.size()-1;i<j;i++,j--)
        {
            if(v[i]!=v[j])
            {
                return false;
            }
        }
       
        return true;
    }
    void midorder(TreeNode *node,int depth,vector<pair<int,int>>&v)
    {
        if(!node->left&&!node->right)
        {
            v.push_back(make_pair(node->val,depth));
            return;
        }
        if(node->left)
        {
            midorder(node->left,depth+1,v);
        }
        v.push_back(make_pair(node->val,depth));
        if(node->right)
        {
            midorder(node->right,depth+1,v);
        }
    }
};


