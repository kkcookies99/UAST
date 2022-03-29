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
                TreeNode* node = que.front();
                list.push_back(node->val);
                que.pop();
                if (node->left) 
                    que.push(node->left);
                if (node->right) 
                    que.push(node->right);    
            }
            res.push_back(list);
        }
        return res;
    }
};


