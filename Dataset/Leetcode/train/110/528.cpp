class Solution {
public:
    int a;
    bool XXX(TreeNode* root) {
        a=0;
        if(!root) return true;
        if(!XXX(root->left)) return false;
        int b=a;
        if(!XXX(root->right)) return false;
        bool r=abs(a-b)<=1;
        a=max(a,b)+1;
        return r;
    }
};

