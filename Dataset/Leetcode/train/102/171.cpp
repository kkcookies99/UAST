class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        if(root==nullptr)return {};
        vector<vector<int>> res;
        queue<TreeNode*> que;
        que.push(root);
        TreeNode* p1,*p2;
        p2 = root;
        vector<int> vec;
        while(!que.empty())
        {
            auto tmp = que.front();
            que.pop();
            if(tmp->left)
            {
                que.push(tmp->left);
                p1 = tmp->left;
            }
            if(tmp->right)
            {
                que.push(tmp->right);
                p1 = tmp->right;
            }
            vec.push_back(tmp->val);
            if(tmp == p2)
            {
                p2 = p1;
                res.push_back(vec);
                vec.clear();
            }
        }
        return res;
    }
};

