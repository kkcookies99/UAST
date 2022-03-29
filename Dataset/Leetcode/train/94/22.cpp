 class Solution {
public:
    vector<int> XXX(TreeNode* root)
    {
        vector<int> data;
        if(root==nullptr)return data;
        helper(data,root);
        return data;
    }
private:
    void helper(vector<int> & res , TreeNode* root)
    {
        if(root==nullptr)return ;
        helper(res,root->left);
        res.push_back(root->val);
        helper(res,root->right);
        return ;
    }
};

