 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(!root) return false;
       
        if(!(root->left)&&!(root->right)){
            if(root->val == targetSum) return true;
            else return false;
        }
        bool leftBool = false;
        bool rightBool = false;
        if(root->left)
            leftBool = XXX(root->left, targetSum - root->val);
        if(root->right)
            rightBool = XXX(root->right, targetSum - root->val);
        return leftBool || rightBool;
    }
};

