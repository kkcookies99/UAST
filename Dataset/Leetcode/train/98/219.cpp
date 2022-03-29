 class Solution {
public:
    // left记录当前节点的上一个节点的值
    long long left = LONG_MIN;
    bool XXX(TreeNode* root) {
        return XXX2(root, NULL, NULL);
    }
    bool XXX1(TreeNode* root) {
        if(!root) return true;
        if(XXX(root->left)) {
            // 如果上一个节点的值小于当前节点，说明满足升序，继续遍历，否则返回false
            if(root->val > left) {
                left = root->val;
                return XXX(root->right);
            }
        }
        return false;
    }
    bool XXX2(TreeNode* root, TreeNode* min, TreeNode* max) {
        if(!root) return true;
        if(min && root->val <= min->val) return false;
        if(max && root->val >= max->val) return false;
        // 判断左子树时，值不能超过root；判断右子树，值不能小于root
        return XXX2(root->left, min, root) && XXX2(root->right, root, max);
    }
};

