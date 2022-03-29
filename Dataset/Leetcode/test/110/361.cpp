class Solution {
public:
    int dfs(TreeNode* root) {
        int leftLen = 0;
        int rightLen = 0;
        if (root->left != nullptr) {
            leftLen = dfs(root->left);
        }
        if (root->right != nullptr) {
            rightLen = dfs(root->right);
        }

        if (leftLen == INT_MAX || rightLen == INT_MAX ) {
            // 大于1说明是非平衡树，高度继续为INT_MAX
            return INT_MAX;
        } else {
            if (abs(leftLen - rightLen) > 1) {
                //说明非平衡树，返回INT_MAX
                return INT_MAX;
            } else {
                //说明是平衡树，树的高度为左子树、右子树中高度较大者
                return (leftLen > rightLen) ? leftLen + 1 : rightLen + 1;
            }

        }

    }
    bool XXX(TreeNode* root) {
        if (root == nullptr) {
            return true;
        }
        return dfs(root) == INT_MAX ? false : true;
    }
};

