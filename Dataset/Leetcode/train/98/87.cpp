 class Solution {
public:
    long last=LONG_MIN;
    bool XXX(TreeNode* root) {
        bool res=true;
        if(root==NULL)
            return true;
        res&=XXX(root->left);
        if(last<root->val)
            last=root->val;
        else 
            return false;
        res&=XXX(root->right);
        return res;
    }
};

