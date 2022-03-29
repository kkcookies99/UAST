class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(root==nullptr)return false;
        return XXX(root,0,targetSum);
    }
    bool XXX(TreeNode* root,const int& sum,const int&targetSum)
    {
        if(root->left==nullptr&&root->right==nullptr)return sum+root->val==targetSum;
        return (root->left!=nullptr?XXX(root->left,sum+root->val,targetSum):false)
            ||(root->right!=nullptr?XXX(root->right,sum+root->val,targetSum):false);
    }
};

