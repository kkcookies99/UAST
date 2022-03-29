 class Solution {
public:
    vector<int>res;
    vector<int> XXX(TreeNode* root) {
        if(!root){return res;}
        travel(root);
        return res;
    }
    void travel(TreeNode* root)
    {
        if(root)
        {
            travel(root->left);
            res.push_back(root->val);
            travel(root->right);
        }
    }
};

