 class Solution {
public:
    void order(vector<int>& v, TreeNode* root) {
        if (root) {
            order(v, root->left);
            v.push_back(root->val);
            order(v, root->right);
        }
    }
    vector<int> XXX(TreeNode* root) {
        vector<int> v;
        order(v, root);
        return v;
    }
};

