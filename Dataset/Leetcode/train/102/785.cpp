 class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        queue<TreeNode *>qtn;
        vector<vector<int>> vvi;
        if(!root)return vvi;
        qtn.push(root);
        int nCount = 1;
        int i = 0;
        int j = 0;
        while(!qtn.empty())
        {
            vector<int>vi;
            while(j < nCount)
            {
                TreeNode * p = qtn.front();
                qtn.pop();
                vi.push_back(p->val);
                if(p->left){qtn.push(p->left); i++;}
                if(p->right){qtn.push(p->right); i++;}
                j++;
            }
            nCount = i;
            i = 0;
            j = 0;
            vvi.push_back(vi);
        }
        return vvi;    
    }
};

