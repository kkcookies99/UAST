class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> ans;
        if(root==nullptr) return ans;

        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty())
        {
            int num=q.size();
            ans.push_back(vector<int>());
            for(int i=0;i<num;++i)
            {
                auto node=q.front();
                q.pop();
                ans.back().push_back(node->val);
                
                if(node->left) q.push(root->left);
                if(node->right) q.push(root->right);
            }
        }
        return ans;
    }
};

