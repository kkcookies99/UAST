class Solution {
public:
    
    vector<vector<int>> bfs(TreeNode* root)
    {
        vector<vector<int>> res;
        if (!root) return res;
        TreeNode* stack[2000];
        int rbp,rsp;
        rbp = rsp = 0;
        stack[rsp++] = root;
        while (rbp < rsp)
        {
            int rspBak = rsp;
            vector<int> v;
            while (rbp < rspBak)
            {
                TreeNode* t = stack[rbp++];
                v.push_back(t->val);
                if (t->left) stack[rsp++] = t->left;
                if (t->right) stack[rsp++] = t->right;
            }
            res.push_back(v);
        }
        return res;
    }
    
    vector<vector<int>> XXX(TreeNode* root)
    {
        return bfs(root);
    }
};

