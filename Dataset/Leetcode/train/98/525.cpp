 class Solution {
public:
    long num=LONG_MAX;
    bool result=true;
    bool XXX(TreeNode* root) {
        if(root==nullptr) return true;
        XXX(root->right);
        if(root->val<num) num=root->val;
        else result=false;
        XXX(root->left);
        return result;
    }
};

