 class Solution {
public:
    vector<int> res;
    vector<int> XXX(TreeNode* root) {
        if(root) {
            XXX(root->left);
            res.push_back(root->val);
            XXX(root->right);
        }
        return res;
    }
};

