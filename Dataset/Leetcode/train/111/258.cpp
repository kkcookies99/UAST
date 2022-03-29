class Solution {
public:
    int XXX(TreeNode* root) {
        if (!root) return 0;
        int lheight = XXX(root->left);
        int rheight = XXX(root->right);
        int height;
        if ((!lheight && !rheight) || (lheight && rheight)) {
            height = min(lheight, rheight);
        }
        else {
            height = max(lheight, rheight);
        }
        return height + 1;
    }
};

