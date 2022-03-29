class Solution {
public:
    // 递归函数
    // p：遍历结点
    // sum：数值之和
    // 目标数值
    // 返回结果，即是否满足题目条件
    void partition(TreeNode *p, int& sum, int targetSum, bool& b)
    {
        // 递归出口
        if (!p) return;
        // 尝试加上该结点的值
        sum += p -> val;

        // 遍历结点 p 的左右子女
        // p 有左右子女
        if (p -> left && p -> right) 
        {
            partition(p -> left, sum, targetSum, b);
            partition(p -> right, sum, targetSum, b);
        }
        // p 只有左子女
        else if (p -> left) partition(p -> left, sum, targetSum, b);
        // p 只有右子女
        else if (p -> right) partition(p -> right, sum, targetSum, b);
        // p 为叶结点，进行比较
        else if (sum == targetSum) b = true;
        // 将 sum 还原
        sum -= p -> val;
    }

    bool XXX(TreeNode* root, int targetSum) {
        int sum = 0;
        bool b = false;
        partition(root, sum, targetSum, b);
        return b;
    }
};

