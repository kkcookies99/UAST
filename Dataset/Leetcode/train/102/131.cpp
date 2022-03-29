class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        pre(root,0,res);
        return res;
    }
    void pre(TreeNode *root, int depth, vector<vector<int>> &res){
        if(!root) return ;
        if(depth >= res.size())
            res.push_back(vector<int> {});
        res[depth].push_back(root->val);
        pre(root->left,depth+1,res);
        pre(root->right,depth+1,res);
    }
};

