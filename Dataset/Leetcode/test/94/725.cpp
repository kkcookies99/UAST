 class Solution {
public:
    vector<int> res;
    void dfs(TreeNode*root){
        if(root ==NULL) return;
        if(root ->left!=NULL)XXX(root ->left);
        res.push_back(root ->val);
        if(root ->right!=NULL)XXX(root ->right);

    }
    vector<int> XXX(TreeNode* root) {
        dfs(root);
        return res;
    }
};

