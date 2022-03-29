 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)return true;
        TreeNode* left = root->left, *right = root->right;
        return helper(left, right);
    }
    bool helper(TreeNode* left, TreeNode* right){
        if(!left&&!right)return true;
        if(left&&right&&left->val==right->val){
            cout<<left->val<<" "<<right->val<<endl;
            return helper(left->left, right->right)&&helper(left->right, right->left);
        }
        else
            return false;
    }
};

