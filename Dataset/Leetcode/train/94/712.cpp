 class Solution {
public:
    vector <int> res;
    vector<int> XXX(TreeNode* root) {
        if(root==NULL) return res;
        if(root->left) XXX(root->left);
        res.push_back(root->val);
        if(root->right) XXX(root->right);
        return res;
    }
};

