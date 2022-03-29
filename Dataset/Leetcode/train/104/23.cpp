class solution {
public:
    int maxdepth(treenode* root) {
        if (root == null) return 0;
        return 1 + max(maxdepth(root->left), maxdepth(root->right));
    }
};


