class Solution {
public:
    vector<vector<int>>res;
    queue<TreeNode*>q;
    vector<vector<int>> XXX(TreeNode* root) {
        if(!root)return res;
        q.push(root);

        while(q.size()){
            vector<int>ans;
            int len=q.size();
            while(len--){
                auto t=q.front();
                q.pop();
                ans.push_back(t->val);
                if(t->left)q.push(t->left);
                if(t->right)q.push(t->right);
            }
            res.push_back(ans);
        }
        return res;
    }
};

