class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> ans;
        if(root == nullptr) {
            return ans;
        }
        queue<TreeNode*> que;
        que.push(root);
        vector<int> tmp;
        while(!que.empty()) {
            auto len = que.size();
            for(auto i = 0; i < len; ++i) {
                auto top = que.front();
                que.pop();
                if(top->left) {
                    que.push(top->left);
                }
                if(top->right) {
                    que.push(top->right);
                }
                tmp.push_back(top->val);
            }
            ans.push_back(tmp);
            tmp.clear();
        }
        return ans;
    }

};

