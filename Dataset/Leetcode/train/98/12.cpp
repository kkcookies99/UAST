 class Solution {
public:
    long long maxVal = LONG_MIN; // 因为后台测试数据中有int最小值
    bool XXX(TreeNode* root) {
        if (root == NULL) return true;

        bool left = XXX(root->left);
        // 中序遍历，验证遍历的元素是不是从小到大
        if (maxVal < root->val) maxVal = root->val;
        else return false;
        bool right = XXX(root->right);

        return left && right;
    }
};

