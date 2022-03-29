 class Solution {
public:
    bool compare(TreeNode* tree1, TreeNode* tree2) {
        if (tree1 == NULL && tree2 != NULL) return false;
        else if (tree1 != NULL && tree2 == NULL) return false;
        else if (tree1 == NULL && tree2 == NULL) return true;
        else if (tree1->val != tree2->val) return false; // 注意这里我没有使用else

        // 此时就是：左右节点都不为空，且数值相同的情况
        // 此时才做递归，做下一层的判断
        bool left = compare(tree1->left, tree2->left);   // 左子树：左、 右子树：左
        bool right = compare(tree1->right, tree2->right);  // 左子树：右、 右子树：右
        bool isSame = left && right;                    // 左子树：中、 右子树：中（逻辑处理）
        return isSame;

    }
    bool XXX(TreeNode* p, TreeNode* q) {
        return compare(p, q);
    }
};

