 class Solution {
public:
    vector<int > res;
    void mid_order(TreeNode* root) {
        if (root == NULL) return;
        mid_order(root->left);
        res.push_back(root->val);
        mid_order(root->right);
    }
    vector<int> XXX(TreeNode* root) {
        mid_order(root);
        return res;
    }
};

