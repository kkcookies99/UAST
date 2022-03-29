 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ret;
        if(root==NULL)return ret;
        inorderHelper(ret,root);
        return ret;
    }

    void inorderHelper(vector<int>& ret,TreeNode* root)
    {
        if(root==NULL)return;
        inorderHelper(ret,root->left);
        ret.push_back(root->val);
        inorderHelper(ret,root->right);
    }
};

