 class Solution {
public:
    bool XXX(TreeNode* root) {
        // 常规思路,递归遍历
        if(root) return twoTreeIsSymmetric(root->left, root->right);
        return true;
    }
private:
    bool twoTreeIsSymmetric(TreeNode* root1, TreeNode* root2)
    {
        if(root1 && root2 && root1->val == root2->val)
        return twoTreeIsSymmetric(root1->left, root2->right) && twoTreeIsSymmetric(root1->right, root2->left);
        return !root1 && !root2;
    }
};

