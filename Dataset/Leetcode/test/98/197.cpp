 class Solution {
public:
    int tmp=0x80000000;
    int lock=1;
    bool XXX(TreeNode* root) {
        if(!root)return true;
        bool A=XXX(root->left);
        if(lock)lock=0;
        else if(tmp>=root->val)return false;
        tmp=root->val;
        bool B=XXX(root->right);
        return A&&B;
    }
};

