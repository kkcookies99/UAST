class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        if(!root)   return {};
        vector<vector<int>> res;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()) {
            vector<int> layer;
            int sz = q.size();
            for(int i = 0; i < sz; i++) {
                auto t = q.front(); q.pop();
                layer.push_back(t->val);
                if(t->left) q.push(t->left);
                if(t->right) q.push(t->right);
            }
            res.push_back(layer);
        }
        return res;
    }
};

