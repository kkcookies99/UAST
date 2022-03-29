class Solution {
public:

    vector<vector<int>> ans;

    vector<vector<int>> XXX(TreeNode* root) {
        dfs(root,0);
        return ans;
    }

    void dfs(TreeNode* root,int depth){
        if(!root) return;

        depth++;
        if(ans.size()<depth){
            vector<int> vec;
            ans.push_back(vec);
        }
        ans[depth-1].push_back(root->val);
        dfs(root->left,depth);
        dfs(root->right,depth);
    }
};

