 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root) return true;
        vector<int> vec;
        dfs(vec,root);
        for(int i=0;i<vec.size()-1;++i)
        if(vec.at(i)>=vec.at(i+1)) return false;

        return true;
    }

    void dfs(vector<int>& vec,TreeNode* root)
    {
        if(!root) return;
        dfs(vec,root->left);
        vec.push_back(root->val);
        dfs(vec,root->right);
    }
};

