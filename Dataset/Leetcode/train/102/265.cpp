class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        queue<TreeNode*> q;
        vector<vector<int>> ans;
        if(root)
            q.push(root);
        while(!q.empty()){
            int cnt=q.size();
            vector<int> res;
            while(cnt>0){
                auto x=q.front();q.pop();
                res.push_back(x->val);
                if(x->left) q.push(x->left);
                if(x->right) q.push(x->right);
                cnt--;
            }
            ans.push_back(res);
        }
        return ans;
    }
};

