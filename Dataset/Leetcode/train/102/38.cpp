class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>>res;
        if(!root) return res;

        queue<TreeNode*>q;
        q.push(root);
        while(!q.empty())
        {
            int sz=q.size();
            vector<int>temp;
            while(sz>0)
            {
                TreeNode*node=q.front();
                q.pop();
                temp.push_back(node->val);
                if(node->left)q.push(node->left);
                if(node->right)q.push(node->right);
                --sz;
            }
            res.push_back(temp);
        }
        return res;
    }
};

