 class Solution {
public:
    long long val = LONG_MIN;
    bool XXX(TreeNode* root) {
        if (root == NULL) return true;
        bool left = XXX(root->left);
        if (val < root->val) val = root->val;// 中序遍历，这里相当于从大到小进行比较
        else return false;
        bool right = XXX(root->right);
        return left && right;
    }
};

