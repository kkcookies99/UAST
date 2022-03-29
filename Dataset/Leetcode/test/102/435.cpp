class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        if (!root) return res;
        queue<TreeNode*> que;
        que.push(root);
        while (que.size())
        {
            int n = que.size();
            vector<int> temp;
            for (int i = 0; i < n; i ++)
            {
                auto node = que.front();
                que.pop();
                temp.push_back(node->val);
                if (node->left) que.push(node->left);
                if (node->right) que.push(node->right);
            }
            res.push_back(temp);
        }
        return res;
    }
};

