class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        queue<TreeNode*> q;
        if(root) q.push(root);
        while(q.size()){
            vector<int> level;
            int len=q.size();
            while(len--){
                auto t=q.front();
                q.pop();
                level.push_back(t->val);
                if(t->left) q.push(t->left);
                if(t->right) q.push(t->right);
            }
            res.push_back(level);
        }
        return res;
    }
};

