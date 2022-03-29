class Solution {
public:

    //双队列，从0层开始，奇数层用que[0]存，偶数层用que[1]存
    vector<vector<int>> doublequeue(TreeNode* root)
    {
        if(!root)
            return {};
        vector<queue<TreeNode*>> que(2);
        vector<vector<int>> res;
        vector<int> vec;
        TreeNode* temp;
        que[0].push(root);
        while(!que[0].empty() || !que[1].empty())
        {
            if(!que[0].empty())
            {
                while(!que[0].empty())
                {
                    temp = que[0].front();
                    vec.push_back(temp->val);
                    que[0].pop();
                    if(temp->left)
                        que[1].push(temp->left);
                    if(temp->right)
                        que[1].push(temp->right);
                }
            }
            else
            {
                while(!que[1].empty())
                {
                    temp = que[1].front();
                    vec.push_back(temp->val);
                    que[1].pop();
                    if(temp->left)
                        que[0].push(temp->left);
                    if(temp->right)
                        que[0].push(temp->right);
                }
            }
            res.push_back(vec);
            vec.clear();
        }
        return res;
    }

    //单队列，每层遍历完之后，用i记录下一层的长度即可
    vector<vector<int>> singlequeue(TreeNode* root)
    {
        if(!root)
            return {};
        list<TreeNode*> que;
        vector<vector<int>> res;
        vector<int> vec;
        TreeNode* temp;
        que.push_back(root);
        while(!que.empty())
        {
            for(int i = que.size(); i > 0; i--)
            {
                temp = que.front();
                que.pop_front();
                vec.push_back(temp->val);
                if(temp->left)
                    que.push_back(temp->left);
                if(temp->right)
                    que.push_back(temp->right);
            }
            res.push_back(vec);
            vec.clear();
        }
        return res;
    }

    vector<vector<int>> XXX(TreeNode* root) {
        // return doublequeue(root);
        return singlequeue(root);
    }
};

