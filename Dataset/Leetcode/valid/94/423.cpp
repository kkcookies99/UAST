 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        in_order(root, res);
        return res;
    }
private:
    void in_order(TreeNode *root, vector<int> &v) {
        if (root == nullptr) return ;
        in_order(root->left, v);
        v.push_back(root->val);
        in_order(root->right, v);
        return ;
    }
};

