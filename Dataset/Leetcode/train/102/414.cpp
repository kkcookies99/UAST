class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int> > ret;
        if(root == nullptr)
        {
            return ret;
        }

        queue<TreeNode*> q;
        q.push(root);

        while(q.size() > 0)
        {
            vector<int> v;
            v.resize(q.size());
            for(int i = 0; i < v.size(); i ++)
            {
                TreeNode* p = q.front();
                v[i] = p->val;
                if(p->left != nullptr)
                {
                    q.push(p->left);
                }
                if(p->right != nullptr)
                {
                    q.push(p->right);
                }
                q.pop();
            }
            ret.push_back(v);
        }
        return ret;
    }
};
