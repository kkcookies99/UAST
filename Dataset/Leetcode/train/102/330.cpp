class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        if(!root) return res;
        queue<TreeNode*> q;
        q.push(root);

        while(q.size()) {
            int sz = q.size();
            res.push_back(vector<int>());
            for(int i = 1; i <= sz; ++i) {
                TreeNode* t = q.front();
                q.pop();
                res.back().push_back(t->val);
                if(t->left) q.push(t->left);
                if(t->right) q.push(t->right);
            }
        }
        return res;
    }
};

