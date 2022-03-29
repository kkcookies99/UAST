class Solution {
public:
    int height(TreeNode *node)  // 求二叉树的高度
    {
        if (!node) return 0;
        return max(height(node -> left) + 1, height(node -> right) + 1);
    }

    bool XXX(TreeNode* root) {   // 递归求解
        if (!root) return true;         // 如果结点为空，返回 true
        int lh = height(root -> left), rh = height(root -> right);  // 获取左右子树的高度
        return abs(lh - rh) < 2 && XXX(root -> left) && XXX(root -> right);   // 判断左右子树的高度是否达标，并递归判断其左子树和右子树是否平衡
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


