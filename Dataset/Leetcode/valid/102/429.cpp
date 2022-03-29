class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        if (root == nullptr)
            return {};
        vector<vector<int>> res;
        queue<TreeNode*> que;
        que.push(root);
        que.push(nullptr); //在队列中放入空指针作为换行的标志
        vector<int> v;
        while (!que.empty()) {
            TreeNode* temp = que.front();
            que.pop();
            if (temp == nullptr) {
                res.push_back(v);
                if (que.size() != 0)
                    que.push(nullptr);
                v = {};
                continue;
            }
            v.push_back(temp->val);
            if (temp->left != nullptr)
                que.push(temp->left);
            if (temp->right != nullptr)
                que.push(temp->right);  
        }
        return res;
    }
};

