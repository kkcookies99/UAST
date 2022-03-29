 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        centreTree(root);
        return v;  
    }
    void centreTree(TreeNode* root)
    {
        if(root == nullptr) return ;
        centreTree(root->left);
        v.push_back(root->val);
        centreTree(root->right);
    }
    vector<int> v;
};

