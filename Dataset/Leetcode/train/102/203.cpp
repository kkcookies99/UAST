class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        if(!root)  return res;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty())
        {
            int layer_size = q.size();
            vector<int> tmp;
            for(int i = 0 ; i < layer_size ; i++)
            {
                auto p = q.front();
                if(p->left) q.push(p->left);
                if(p->right) q.push(p->right);
                tmp.push_back(p->val);
                q.pop();
            }
            res.push_back(tmp);
        }
        return res;
    }
};

