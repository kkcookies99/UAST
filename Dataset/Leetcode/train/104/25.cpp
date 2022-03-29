class solution {
public:
    int result;
    void getdepth(treenode* node, int depth) {
        result = depth > result ? depth : result; // 中
        if (node->left == null && node->right == null) return ;
        if (node->left) { // 左
            getdepth(node->left, depth + 1);
        }
        if (node->right) { // 右
            getdepth(node->right, depth + 1);
        }
        return ;
    }
    int maxdepth(treenode* root) {
        result = 0;
        if (root == 0) return result;
        getdepth(root, 1);
        return result;
    }
};

