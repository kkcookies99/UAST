 class Solution {
public:
    long pre=LONG_MIN;
    bool XXX(TreeNode* root) {
        //中序遍历，记录上一个访问到的值，和当前值进行比较
        if(root==NULL) return true;
        bool l=XXX(root->left);
        if(pre>=root->val)
            return false;
        pre=root->val;
        bool r=XXX(root->right);
        return l&&r;
    }
};

