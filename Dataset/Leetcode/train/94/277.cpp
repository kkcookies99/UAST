 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> tree;
        bitree(root, tree);
        return tree;
    }

    void bitree(TreeNode* root, vector<int>&tree)
    {
        if(root == nullptr) return;
        bitree(root->left, tree);
        tree.push_back(root->val);
        bitree(root->right, tree);
        return;
    }

};

