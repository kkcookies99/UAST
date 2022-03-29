class Solution {
public:
    bool XXX(TreeNode* root, int sum)
    {
        if(root == NULL) return false;
        if(root->left == NULL && root->right == NULL)   // 叶子结点
        {
            if (root->val == sum) return true;
            else return false;            
        }

        bool res = false;
        res = res | XXX(root->left, sum - root->val);   // 左子树查询
        res = res | XXX(root->right, sum - root->val);  // 右子树查询

        return res;
    }

};

