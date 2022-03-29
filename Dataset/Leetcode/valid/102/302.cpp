class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        if(!root) return res;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()) {
            int l = q.size();
            vector<int> tmp;
            for(int i=0; i<l; i++) {
                auto t = q.front();
                q.pop();
                tmp.push_back(t->val);
                if(t->left != nullptr) q.push(t->left);
                if(t->right != nullptr) q.push(t->right);
            }
            res.push_back(tmp);
        }
        return res;
    }
};

