struct Tree
{
    TreeNode *node;
    int deep;
};
class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        queue<Tree> q;
        vector<vector<int>> vv;
        if(!root)return vv;
        q.push({root,0});
        while(!q.empty())
        {
            vv.resize(q.front().deep+1);
            vv[q.front().deep].push_back(q.front().node->val);
            if(q.front().node->left)q.push({q.front().node->left,q.front().deep+1});
            if(q.front().node->right)q.push({q.front().node->right,q.front().deep+1});
            q.pop();
        }
        return vv;
    }
};

