 class Solution {
public:
    vector<int> res;
    void midt(TreeNode* root){
        if(root->left) midt(root->left);
        res.push_back(root->val);
        if(root->right) midt(root->right);
    }
    vector<int> XXX(TreeNode* root) {
        if(root) midt(root);
        return res;
    }
};```

