 class Solution {
public:
    vector<int> res;
    vector<int> XXX(TreeNode* root) 
    {
        inorder(root);
        return res;
    }
    void inorder(TreeNode* root)
    {
        if(root==NULL)
            return;
        inorder(root->left);
        res.push_back(root->val);
        inorder(root->right);
    }
};

