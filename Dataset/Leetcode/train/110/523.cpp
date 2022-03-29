class Solution {
public:
    bool XXX(TreeNode* root) {
        if (root == nullptr) return true;
        int hd = height(root -> left) - height(root -> right);
        if (hd < -1 || hd > 1) return false; //注意条件不能写反 return Ture需要看到底才能判断，更苛刻一些
        return XXX(root -> left) && XXX(root -> right);
    }
    int height(TreeNode* node) {
        if (node == nullptr) return 0;
        return max(height(node -> left), height(node -> right)) + 1;
    }
};

