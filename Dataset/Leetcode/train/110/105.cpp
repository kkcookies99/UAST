class Solution {
public:
    bool XXX(TreeNode* root) {//执行时间8ms
        if(!root|| !root->left&&!root->right) return true;
        if(abs(maxDepth(root->left) - maxDepth(root->right))>1) return false;//比较子树是否平衡
        return XXX(root->left)&&XXX(root->right);
    }
    int maxDepth(TreeNode* root)//计算树的高度
    {
        return root == NULL? 0:max(maxDepth(root->left),maxDepth(root->right))+1;
    }
};

