class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res; //保存结果
        TreeNode* p = root;
        if(!p)
            return res;
        queue<TreeNode*> Queue; //队列保存结点的指针
        Queue.push(p);
        while(!Queue.empty())
        {
            int count = Queue.size();
            vector<int> ivec;
            while(count != 0)
            {
                p = Queue.front();
                Queue.pop();
                ivec.push_back(p->val);
                if(p->left)
                    Queue.push(p->left);
                if(p->right)
                    Queue.push(p->right);
                --count;
            }
            res.push_back(ivec);
        }
        return res;
    }
};

