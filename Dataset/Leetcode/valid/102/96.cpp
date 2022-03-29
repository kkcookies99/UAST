class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        if(!root)
            return res;
        TreeNode *nlast=root,*last=nullptr;
        vector<int> vec;
        queue<TreeNode*> que;
        que.push(root);
        while(!que.empty())
        {
            TreeNode *cur=que.front();
            que.pop();
            if(cur->left)
            {
                que.push(cur->left);
                last=cur->left;
            }
            if(cur->right)
            {
                que.push(cur->right);
                last=cur->right;
            }
            vec.push_back(cur->val);
            if(cur==nlast)
            {
                res.push_back(vec);
                vec.clear();
                nlast=last;
            }
        }
        return res;
    }
};

