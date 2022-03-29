 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        bool bResult = false;
        if(root == NULL)return false;
        return checkPathSum(root, 0, sum);
    }
    bool checkPathSum(TreeNode* root, int presum, int sum)
    {
        if(root == NULL) return 0;
        if(root->left == NULL && root->right == NULL)
        {
            if(presum + root->val == sum)return true;
            else return false;
        }
        presum += root->val;
        if(checkPathSum(root->left, presum, sum) || checkPathSum(root->right, presum, sum))
            return true;
        else return false;
    }
};

