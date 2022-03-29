 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        if(root == nullptr) return vector<int>();
        vector<int> res;
        inorder(res, root);
        return res;
    }

    void inorder(vector<int>& res, TreeNode* node) {
        if(node->left) inorder(res, node->left);
        res.push_back(node->val);
        if(node->right) inorder(res, node->right);
    }
};

