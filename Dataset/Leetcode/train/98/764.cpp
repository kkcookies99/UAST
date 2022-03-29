 class Solution {
public:
    bool help(TreeNode* root,long max,long min){
        if(!root)
            return true;
        return max>root->val&&min<root->val?help(root->left,root->val,min)&&help(root->right,max,root->val):false;
    }
    bool XXX(TreeNode* root) {
        return help(root,100000000000,-100000000000);
    }
};

