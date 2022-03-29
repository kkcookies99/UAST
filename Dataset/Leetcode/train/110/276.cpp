class Solution {
public:
    bool flag = true;
    bool XXX(TreeNode* root) {
        int i = dg(root);
        if (flag == false)
            return false;
        return true;
    }

    int dg(TreeNode* root) {
        if (root == nullptr)
            return 0;
        int left = dg(root->left);
        int right = dg(root->right);
        if (abs(left - right) > 1)
            flag = false;
        return max(left, right) + 1;
    }
};

