class Solution {
public:
    queue<TreeNode*> que;
    vector<vector<int>> XXX(TreeNode* root) 
    {
        vector<vector<int> > res;
        if(root==NULL)
            return res;
        que.push(root);
        int layer = 0;
        while(!que.empty())
        {
            vector<int> myadd;
            int len = que.size();
            for(int i=0;i<len;i++)
            {
                TreeNode* temp = que.front();
                que.pop();
                if(temp->left)
                    que.push(temp->left);
                if(temp->right)
                    que.push(temp->right);
                myadd.push_back(temp->val);
            }
            res.push_back(myadd);
            
        }
        return res;
    }
};

