class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        if (!root) return {};
        vector<vector<int>> res;
        queue<TreeNode*> que;
        que.push(root);
        while(que.size()!=0) {
            vector<int> list;
            int size = que.size();
            for (int i=0; i<size; ++i) {
                TreeNode* tmp = que.front();
                list.push_back(tmp->val);
                que.pop();
                if (root->left) {
                    que.push(root->left);
                }
                if (root->right) {
                    que.push(root->right);
                }
            }
            res.push_back(list);
        }
        return res;
    }
};


