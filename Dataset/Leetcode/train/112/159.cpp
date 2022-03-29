class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(!root) return false;
        targetSum-=root->val;
        if(!root->left&&!root->right&&targetSum==0) return true;//只要有一条满足就行
        return XXX(root->left,targetSum)||XXX(root->right,targetSum);
    }
};

